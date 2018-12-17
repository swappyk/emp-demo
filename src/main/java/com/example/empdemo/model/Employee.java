package com.example.empdemo.model;

public class Employee {

	private Integer emplId;
	//private String status;
	private String empName;
	private Double totalSalary;
	private String state;

	public Employee(Integer emplId, String empName, Double totalSalary, String state) {
		super();
		this.emplId = emplId;
		this.empName = empName;
		this.totalSalary = totalSalary;
		this.setState(state);
	}

	public Integer getEmplId() {
		return emplId;
	}

	public void setEmplId(Integer emplId) {
		this.emplId = emplId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(Double totalSalary) {
		this.totalSalary = totalSalary;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
