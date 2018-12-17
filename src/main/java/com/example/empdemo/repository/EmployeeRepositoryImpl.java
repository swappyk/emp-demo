package com.example.empdemo.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.empdemo.customException.EmployeeNotFoundException;
import com.example.empdemo.model.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

	private List<Employee> empList = new ArrayList(
			Arrays.asList(new Employee(1, "A", 1000.00, "California"), new Employee(2, "B", 2000.00, "Texas"),
					new Employee(3, "C", 3000.00, "California"), new Employee(4, "D", 4000.00, "Texas")));

	public Employee getEmployeeDetails(Integer emplid) {

		// The below java8 syntax is working but to show case exception handling
		// I have used java7 version
		// return empList.stream().filter(e -> e.getEmplId() ==
		// emplid).findFirst().get();

		Employee emp = null;

		for (Employee e : empList) {
			if (e.getEmplId().equals(emplid)) {
				emp = e;
				break;
			}
		}
		if (emp == null) {
			throw new EmployeeNotFoundException("Employee with id " + emplid + " is not found");
		}

		return emp;
	}

	@Override
	public List<Employee> getEmployeesList() {
		return empList;
	}

	@Override
	public String addEmployee(String empName, Double totalSalary, String state) {

		empList.add(new Employee(fetchEmployeeId()+1, empName, totalSalary, state));
		return "Employee added successfully";
	}

	private Integer fetchEmployeeId() {

		int emplid = 1;

		for (Employee e : empList) {

			if (e.getEmplId() > emplid) {
				emplid = e.getEmplId();
			}
		}
		return emplid;
	}
}