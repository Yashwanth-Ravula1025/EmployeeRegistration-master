package com.UST.EmployeeRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UST.EmployeeRegistration.model.Employee;
import com.UST.EmployeeRegistration.service.EmployeeService;

@RestController
@RequestMapping("/emp/registration")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/addemps")
	//Requesting employee details to service
	public Employee addemp(@RequestBody Employee employee)
	{
		return employeeService.createEmployee(employee);
	}
	
	
	
}
