package com.crimsonlogic.employee;

import com.crimson.employeeinheritance.Programmer;
import com.crimsonlogic.util.EmployeeOperations;
import com.crimsonlogic.util.SeniorProgrammerOperations;

public class EmployeeRunner {

	public static void main(String[] args) {
		EmployeeOperations eo = new EmployeeOperations();
		eo.readEmployeeDetails();
		eo.displayEmployeeDetails();
		Programmer p = new Programmer();
		p.provideBonus();
		SeniorProgrammerOperations so = new SeniorProgrammerOperations();
		so.readDetails();

	}

}
