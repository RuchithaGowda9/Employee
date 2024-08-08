package com.crimsonlogic.util;

import java.util.Scanner;

import com.crimson.employeeinheritance.SeniorProgrammer;

public class SeniorProgrammerOperations extends SeniorProgrammer {

	Scanner sc = new Scanner(System.in);
	SeniorProgrammer sp = new SeniorProgrammer();

	public void readDetails() {
		if (sp.getExperience() > 5) {
			System.out.println("Enter the number of shares you own");
			sp.setNoOfshares(sc.nextInt());
			System.out.println("Enter number of certifications completed");
			sp.setNoOfCertifications(sc.nextInt());
			// System.out.println("Enter the names of your certifications");
			// for (int i = 0; i < sp.getNoOfCertifications(); i++) {
			// certifications[i] = sc.next();
			// }
			// sp.setCertifications(certifications);
			System.out.println("Enter the no of projects completed");
			sp.setNoOfProjectsCOmpleted(sc.nextInt());
			// System.out.println("Enter your project names");
			// for (int i = 0; i < sp.getNoOfProjectsCOmpleted(); i++) {
			// projectsCompleted[i] = sc.next();
			// }
			// sp.setProjectsCompleted(projectsCompleted);
			System.out.println("Enter the number of team members");
			sp.setNoOfTeamMembers(sc.nextInt());

			displayDetails();
		} else {
			System.out.println("Sorry! you are not eligible");
		}
	}

	public void displayDetails() {
		System.out.println("No of shares : " + sp.getNoOfshares());
		// System.out.println("Certifications completed : " + sp.getCertifications());
		// System.out.println("Projects completed : " + sp.getNoOfProjectsCOmpleted());
		System.out.println("Number of team members : " + sp.getNoOfTeamMembers());
	}
}
