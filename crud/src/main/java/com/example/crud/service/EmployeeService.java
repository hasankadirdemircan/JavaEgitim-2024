package com.example.crud.service;

import com.example.crud.model.Employee;
import com.example.crud.repository.EmployeeRepository;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployeeList() {
        return employeeRepository.findAll();
    }

    public Employee findEmployeeById(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent()) {
            Employee employee1 = employee.get();
            employee1.setAge(employee1.getAge() * 2);
            return employee.get();
        }else {
            throw new RuntimeException("No employee for id: " + id);
        }
    }

    public List<Employee> findEmployeeListWhoOlderThan20() {
        return employeeRepository.findEmployeeListWhoOlderThan20();
    }

    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public int sum(int number1, int number2) {
        return number1 + number2;
    }

    public int calculateAge(LocalDate playerBirthDate) {
        LocalDate localDate = LocalDate.now();
        return Period.between(playerBirthDate, localDate).getYears();
    }

}
