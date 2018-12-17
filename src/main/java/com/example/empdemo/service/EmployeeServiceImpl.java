package com.example.empdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.empdemo.model.Employee;
import com.example.empdemo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repo;

	public Employee getEmployeeDetails(Integer emplid) {
		return repo.getEmployeeDetails(emplid);
	}

	public List<Employee> getEmployeesList() {
		return repo.getEmployeesList();
	}

	public String addEmployee(String empName, Double totalSalary, String state) {
		return repo.addEmployee(empName, totalSalary, state);
	}

}
