package com.crimson.employeeinheritance;

import java.util.Arrays;

public class SeniorProgrammer extends Employee {
	private int noOfshares;
	private int noOfCertifications;
	private int noOfTeamMembers;
	private int noOfProjectsCOmpleted;
	protected static String[] certifications;
	protected static String[] projectsCompleted;

	public SeniorProgrammer() {

	}

	public SeniorProgrammer(int noOfshares, int noOfCertifications, String[] certifications, int noOfTeamMembers,
			int noOfProjectsCOmpleted, String[] projectsCompleted) {
		super();
		this.noOfshares = noOfshares;
		this.noOfCertifications = noOfCertifications;
		this.certifications = certifications;
		this.noOfTeamMembers = noOfTeamMembers;
		this.noOfProjectsCOmpleted = noOfProjectsCOmpleted;
		this.projectsCompleted = projectsCompleted;
	}

	public int getNoOfshares() {
		return noOfshares;
	}

	public void setNoOfshares(int noOfshares) {
		this.noOfshares = noOfshares;
	}

	public String[] getCertifications() {
		return certifications;
	}

	public void setCertifications(String[] certifications) {
		this.certifications = certifications;
	}

	public int getNoOfTeamMembers() {
		return noOfTeamMembers;
	}

	public void setNoOfTeamMembers(int noOfTeamMembers) {
		this.noOfTeamMembers = noOfTeamMembers;
	}

	public String[] getProjectsCompleted() {
		return projectsCompleted;
	}

	public void setProjectsCompleted(String[] projectsCompleted) {
		this.projectsCompleted = projectsCompleted;
	}

	public int getNoOfCertifications() {
		return noOfCertifications;
	}

	public void setNoOfCertifications(int noOfCertifications) {
		this.noOfCertifications = noOfCertifications;
	}

	public int getNoOfProjectsCOmpleted() {
		return noOfProjectsCOmpleted;
	}

	public void setNoOfProjectsCOmpleted(int noOfProjectsCOmpleted) {
		this.noOfProjectsCOmpleted = noOfProjectsCOmpleted;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(certifications);
		result = prime * result + noOfCertifications;
		result = prime * result + noOfProjectsCOmpleted;
		result = prime * result + noOfTeamMembers;
		result = prime * result + noOfshares;
		result = prime * result + Arrays.hashCode(projectsCompleted);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SeniorProgrammer other = (SeniorProgrammer) obj;
		if (!Arrays.equals(certifications, other.certifications))
			return false;
		if (noOfCertifications != other.noOfCertifications)
			return false;
		if (noOfProjectsCOmpleted != other.noOfProjectsCOmpleted)
			return false;
		if (noOfTeamMembers != other.noOfTeamMembers)
			return false;
		if (noOfshares != other.noOfshares)
			return false;
		if (!Arrays.equals(projectsCompleted, other.projectsCompleted))
			return false;
		return true;
	}

}
