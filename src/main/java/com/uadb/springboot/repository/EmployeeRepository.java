package com.uadb.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uadb.springboot.model.Employee;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
    public List<Employee> findByFirstName(String firstName);

}
