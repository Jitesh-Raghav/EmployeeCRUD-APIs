package com.example.springboot_crud_session;

import com.example.springboot_crud_session.model.Employee;
import com.example.springboot_crud_session.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCrudSessionApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCrudSessionApplication.class, args);
    }

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {

        Employee employee= new Employee();
        employee.setFirstName("Jitesh");
        employee.setLastName("Raghav");
        employee.setEmailId("jitesh@gmail.com");
        employeeRepository.save(employee);

        Employee employee1= new Employee();
        employee1.setFirstName("Sahil");
        employee1.setLastName("Raghav");
        employee1.setEmailId("sahil@gmail.com");
        employeeRepository.save(employee1);
    }
}
