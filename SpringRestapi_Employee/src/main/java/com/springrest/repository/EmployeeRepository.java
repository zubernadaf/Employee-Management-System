package com.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
