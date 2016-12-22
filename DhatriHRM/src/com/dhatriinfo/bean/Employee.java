package com.dhatriinfo.bean;

public class Employee {
	private String employeeId;
	private String employeeName;
	private double employeeSalary;
	private float experiance;
	private String Location;
   private double emploan;
	private double emi;
	
	
	//Generate setters and getters
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public float getExperiance() {
		return experiance;
	}
	public void setExperiance(float experiance) {
		this.experiance = experiance;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public double getEmploan() {
		return emploan;
	}
	public void setEmploan(double emploan) {
		this.emploan = emploan;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
		}
	
}