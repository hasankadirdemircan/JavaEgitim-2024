package com.example.springdata.repository;

import com.example.springdata.model.Employee;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    //Hibernate: select e1_0.employee_id,e1_0.address,e1_0.age,e1_0.firstname,e1_0.surname from employee e1_0
    // where e1_0.firstname=? and e1_0.surname=?
    List<Employee> findEmployeeByFirstnameAndSurname(String firstname, String surname);


    //select * from employee where firstname = 'c' OR address = b AND age = 20
   // List<Employee> findEmployeeByFirstnameOrAddressAndAge(String firstname, String address, int age);


  /*  @Query("select e.employeeId from Employee e where e.firstname=:f and e.surname=:s")
    List<Long> findEmployeeListByFirstnameAndSurname(String f, String s);*/
    @Query("select e from Employee e where e.firstname=:f and e.surname=:s")
    List<Employee> findEmployeeListByFirstnameAndSurname(String f, String s);

    @Modifying
    @Query("delete from Employee e where e.employeeId = :id")
    void deleteEmployeeById(Long id);

    @Modifying
    @Query(value = "update employee set address = :address where employee_id = :id", nativeQuery = true)
    void updateAddressForEmployee(String address, Long id);

    @Query(value = "select * from employee", nativeQuery = true)
    List<Employee> getAllEmployeeList();
}
