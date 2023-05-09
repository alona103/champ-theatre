package com.bootcamp.web.service;

import java.util.List;

import com.bootcamp.web.entity.EmployeeRole;
import com.bootcamp.web.entity.Module;
import com.bootcamp.web.entity.Role;

public interface RoleManagementService {
	
	List<Role> getAllRoles();
	
	void addRole(Role role, List<Module> modules);
	
	void updateRole(Role role, List<Module> modules);
	
	void deleteRole(Role role);
	
	void updateEmployeeRole(EmployeeRole employeeRole);
	
}
