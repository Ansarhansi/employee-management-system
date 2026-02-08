package com.qsp.employee_management_system.entity;

public class Employee {
	private int eId;
	private String eName;
	private double eSalary;
	private String eLoc;

	public int geteId() {
		return eId;
	}

	public void seteId(int i) {
		this.eId = i;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double geteSalary() {
		return eSalary;
	}

	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}

	public String geteLoc() {
		return eLoc;
	}

	public void seteLoc(String eLoc) {
		this.eLoc = eLoc;
	}
}
