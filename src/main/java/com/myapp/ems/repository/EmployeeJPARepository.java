package com.myapp.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myapp.ems.model.Employee;


@Repository
public interface EmployeeJPARepository extends JpaRepository<Employee, Long>{

}

