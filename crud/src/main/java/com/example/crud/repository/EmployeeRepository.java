package com.example.crud.repository;

import com.example.crud.model.Employee;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("Select e from Employee e WHERE e.age > 30")
    List<Employee> findEmployeeListWhoOlderThan20();
}
