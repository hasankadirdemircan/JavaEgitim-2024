package com.example.springdata;

import com.example.springdata.model.CustomerOrderDTO;
import com.example.springdata.model.Employee;
import com.example.springdata.repository.EmployeeRepository;
import com.example.springdata.repository.OrderRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Transactional // ben bunu ekledim cünkü tek bir islemde birden fazla veritabanı işlemi yaptığımda,içlerinden en az 1 tanesi hata alırsa, diğer işlemleri de iptal etmeye yarıyor. Ek olarak DELETE, UPDATE gibi kendi sorgularım(JPQL) de gerekli.
public class SpringdataApplication implements CommandLineRunner {

	//TODO: Spring data projesi oluşturunuz, jdbc de verdiğim ve yapacağınız ödevi daha sonrasında Spring Data ile yapınız.

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private OrderRepository orderRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringdataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//findEmployeeByFirstnameAndSurname();

		//	findEmployeeById();
		//	updateEmployeeById();
    /*    Employee employee = new Employee();
		employee.setAddress("xx etimesgut");
		employee.setSurname("aa");
		employee.setFirstname("bb");
		employee.setAge(32);
		employeeRepository.save(employee);*/
		//findAllEmployee();
		//deleteEmployeeById(552L);
		//findAllEmployeeThenDelete();
		//findEmployeeListByFirstnameAndSurname();

	//deleteEmployeeByIdJPQL();
		updateEmployeeByIdNative();
		//getAllEmployeeNative();,

		//customerOrderDto();
	}

	public void findAllEmployee() {
		List<Employee> employeeList = employeeRepository.findAll();
        /*for(Employee employee : employeeList) {
			System.out.println(employee.toString());
		}*/
		employeeList.forEach(System.out::println);
	}

	public void findEmployeeById() {
		Optional<Employee> employee = employeeRepository.findById(452L);
		//employee.ifPresent(System.out::println);
		Employee e = employee.orElse(new Employee());
		//	Employee e = employee.orElse(null);

		System.out.println(e);
	}

	public void updateEmployeeById() {
		Employee employee = new Employee();
		employee.setEmployeeId(5512L);
		employee.setAddress("ankxccara cankaya");
		employee.setSurname("asdsadasd");
		employee.setFirstname("qwe");
		employee.setAge(29);
		employeeRepository.save(employee);
	}

	public void findEmployeeByFirstnameAndSurname() {
		List<Employee> employeeList = employeeRepository.findEmployeeByFirstnameAndSurname("bb", "aa");
	//	List<Employee> asds = employeeRepository.findEmployee" ByFirstnameOrAddressAndAge("c", "b", 20);
		System.out.println(employeeList.toString());
	}

	public void deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);
	}

	public void findAllEmployeeThenDelete() {
		List<Employee> employeeList = employeeRepository.findAll();
		employeeList.stream().filter(e -> e.getEmployeeId().equals(452L)).forEach(e -> employeeRepository.delete(e));
	}

	public void findEmployeeListByFirstnameAndSurname() {
		List<Employee> employeeList = employeeRepository.findEmployeeListByFirstnameAndSurname("bb", "aa");
		employeeList.forEach(System.out::println);
	}

	public void deleteEmployeeByIdJPQL() {

		employeeRepository.deleteEmployeeById(602L);
	}

	public void updateEmployeeByIdNative() {
		employeeRepository.updateAddressForEmployee("abc", 652L);
	}

	public void getAllEmployeeNative() {
		List<Employee> employeeList = employeeRepository.getAllEmployeeList();
		employeeList.forEach(System.out::println);
	}

	public void customerOrderDto() {
		List<CustomerOrderDTO> orderDTOList = orderRepository.findOrderNameAndCustomerName();
		orderDTOList.forEach(System.out::println);
	}
}
