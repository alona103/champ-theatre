package com.bootcamp.web.repository;

import com.bootcamp.web.entity.EmployeeRole;
import com.bootcamp.web.entity.Role;
import com.bootcamp.web.entity.RoleModule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.Set;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRole(String role);
    Optional<Role> findByModule(Set<RoleModule> module);
    Optional<Role> findByEmployee(Set<EmployeeRole> employee);
}
