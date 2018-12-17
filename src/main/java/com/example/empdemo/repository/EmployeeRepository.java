package com.example.empdemo.repository;

import java.util.List;

import com.example.empdemo.model.Employee;

public interface EmployeeRepository {

	public Employee getEmployeeDetails(Integer emplid);
	public List<Employee> getEmployeesList();
	public String addEmployee(String empName, Double totalSalary, String state);

}
