package com.crimsonlogic.util;

import java.util.Scanner;

import com.crimson.employeeinheritance.Employee;
import com.crimson.employeeinheritance.Programmer;

public class EmployeeOperations extends Employee {

	Scanner sc = new Scanner(System.in);
	Programmer p = new Programmer();

	public void readEmployeeDetails() {
		System.out.println("Enter employee id");
		p.setEmpId(sc.nextInt());
		System.out.println("Enter employee name");
		sc.nextLine();
		p.setEmpName(sc.nextLine());
		System.out.println("Enter your salary");
		p.setSalary(sc.nextDouble());
		System.out.println("Enter experience");
		p.setExperience(sc.nextInt());
	}

	public void displayEmployeeDetails() {
		System.out.println("Employee ID : " + p.getEmpId());
		System.out.println("Employee name : " + p.getEmpName());
		System.out.println("Salary : " + Employee.getSalary());
		System.out.println("Experience : " + p.getExperience());
	}
}
