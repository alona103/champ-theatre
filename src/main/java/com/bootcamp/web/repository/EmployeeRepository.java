package com.bootcamp.web.repository;

import com.bootcamp.web.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//    @Query("SELECT employee FROM Employee e where e.id = :id")
//    Employee findById(@Param("id") int id);
}

