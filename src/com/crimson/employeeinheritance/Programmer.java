package com.crimson.employeeinheritance;

public class Programmer extends Employee {
	static double bonus = 0.15f;

	public static double getBonus() {
		return bonus;
	}

	public static void setBonus(double bonus) {
		Programmer.bonus = bonus;
	}

	public void provideBonus() {
		if (getExperience() > 5) {
			setBonus(bonus + 0.5);
			salary = salary + (salary * bonus);
			System.out.println("Updated salary with bonus : " + Math.round(salary));
		} else {
			salary = salary + (salary * bonus);
			System.out.println("Updated salary with bonus : " + Math.round(salary));
		}

	}
}
