package com.bootcamp.web.service;

import java.util.List;

import com.bootcamp.web.entity.Employee;
import com.bootcamp.web.entity.EmployeeAccount;

public interface EmployeeManagementService {
	
	void register(Employee employee);
	
	List<Employee> getAllEmployee();
	
	void updateEmployeeDetails(Employee employee);
	
	void updateEmployeeAccountStatus(EmployeeAccount employeeAccount);
	
	void deleteEmployeeAccount(EmployeeAccount employeeAccount);
	
	void addEmployeeAccount(Employee employeeId, EmployeeAccount employeeAccount);

}
