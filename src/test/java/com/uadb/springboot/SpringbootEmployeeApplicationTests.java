package com.uadb.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.uadb.springboot.model.Employee;
import com.uadb.springboot.repository.EmployeeRepository;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SpringbootEmployeeApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void getAllEmployees() {
		assertNotNull(employeeRepository.findAll());
	}

	@Test
	void createEmployee() {
		Employee employee = new Employee();
		employee.setFirstName("Awa");
		employee.setLastName("NDIAYE");
		employee.setEmailId("awa.ndiaye@gmail.com");
		Employee em = employeeRepository.save(employee);

		assertNotNull(em);
	}

	@Test
	void findById() {
		Employee employee = employeeRepository.findById(3L).get();
		assertNotNull(employee);
	}

	@Test
	void updateEmployee() {
		Employee employee = employeeRepository.findById(3L).get();
		
		employee.setFirstName("Awa");
		employee.setLastName("NDIAYE TRAORE");
		employee.setEmailId("awa.traore@gmail.com");
		Employee em = employeeRepository.save(employee);

		assertNotNull(em);
	}

	@Test
	void deleteEmployee() {
		employeeRepository.deleteById(1L);
	}

}
