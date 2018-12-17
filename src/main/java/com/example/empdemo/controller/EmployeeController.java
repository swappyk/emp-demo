package com.example.empdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.empdemo.model.Employee;
import com.example.empdemo.service.EmployeeServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(path = "/rest")
@Api(value = "Employee Resource", description = "Employee Operations")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl service;

	@PostMapping("/addEmployee/{emplid}/{empName}/{totalSalary}/{state}")
	@ApiOperation(value = "Returns the employee details")
	public String addEmployee(@PathVariable String empName,
			@PathVariable Double totalSalary, @PathVariable String state) {
		return service.addEmployee(empName, totalSalary, state);
	}

	@GetMapping("/getEmployeesList")
	@ApiOperation(value = "Returns the employee details")
	public ResponseEntity<List<Employee>> getEmployeesList() {
		return new ResponseEntity<List<Employee>>(service.getEmployeesList(), HttpStatus.OK);
	}

	@GetMapping("/getEmployeeDetail/{emplid}")
	@ApiOperation(value = "Returns the employee details")
	public ResponseEntity<Employee> getEmployeeDetails(@PathVariable Integer emplid) {
		return new ResponseEntity<Employee>(service.getEmployeeDetails(emplid), HttpStatus.OK);
	}

}
