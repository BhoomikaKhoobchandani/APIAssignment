package net.javaguides.Springboot;

import net.javaguides.Springboot.model.Employee;
import net.javaguides.Springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCrudProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudProjectApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		Employee employee= new Employee();
		employee.setFirstname("Bhoomika");
		employee.setLastname("Khoobchandani");
		employee.setEmailId("khoobchandanibhoomika@gmail.com");
		employeeRepository.save(employee);

		Employee employee1= new Employee();
		employee1.setFirstname("Mayur");
		employee1.setLastname("Warfade");
		employee1.setEmailId("warfademayur@gmail.com");
		employeeRepository.save(employee1);

	}
}
