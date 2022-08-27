package edu.gor.springboot.springboot_data_jpa.dao;


import edu.gor.springboot.springboot_data_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByName(String name);
}
