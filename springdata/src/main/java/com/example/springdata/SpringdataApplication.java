package com.example.springdata;

import com.example.springdata.model.Employee;
import com.example.springdata.repository.EmployeeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdataApplication implements CommandLineRunner {

	//TODO: Spring data projesi oluşturunuz, jdbc de verdiğim ve yapacağınız ödevi daha sonrasında Spring Data ile yapınız.

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringdataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		test();
		//findAllEmployee();
		//	findEmployeeById();
		//	updateEmployeeById();
        /*Employee employee = new Employee();
		employee.setAddress("ankara etimesgut");
		employee.setSurname("ronaldo");
		employee.setFirstname("cristiano");
		employee.setAge(29);
		employeeRepository.save(employee);*/
	}

	public void findAllEmployee() {
		List<Employee> employeeList = employeeRepository.findAll();
        /*for(Employee employee : employeeList) {
			System.out.println(employee.toString());
		}*/
		employeeList.forEach(System.out::println);
	}

	public void findEmployeeById() {
		Optional<Employee> employee = employeeRepository.findById(512L);
		//employee.ifPresent(System.out::println);
		Employee e = employee.orElse(new Employee());
		//	Employee e = employee.orElse(null);

		System.out.println(e);
	}

	public void updateEmployeeById() {
		Employee employee = new Employee();
		employee.setEmployeeId(342L);
		employee.setAddress("ankara cankaya");
		employee.setSurname("ronaldo11");
		employee.setFirstname("cristiano");
		employee.setAge(29);
		employeeRepository.save(employee);
	}

	public void test() {
		List<Employee> employeeList = employeeRepository.findEmployeeByFirstnameAndSurname("c", "b");
		System.out.println(employeeList.toString());
	}
}
