package com.example.springboot_crud_session.repository;

import com.example.springboot_crud_session.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //its not needed as its embedded in jpaRepository anyways
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//all crud database methods

}
