/**
 * 
 */
package com.UST.EmployeeRegistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UST.EmployeeRegistration.model.Employee;
import com.UST.EmployeeRegistration.repository.EmployeeRepo;

/**
 * @author Administrator
 *
 */
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo repo;

	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		return repo.save(employee);
	}

}
