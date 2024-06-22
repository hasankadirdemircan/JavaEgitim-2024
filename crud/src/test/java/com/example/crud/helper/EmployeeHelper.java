package com.example.crud.helper;

import com.example.crud.model.Employee;

public class EmployeeHelper {

    public static Employee employeeWithoutId() {
        Employee employee = new Employee();
        employee.setAge(20);
        employee.setUsername("hasan");
        employee.setSalary(3.0);
        return employee;
    }

    public static Employee employee() {
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setAge(20);
        employee.setUsername("hasan");
        employee.setSalary(3.0);
        return employee;
    }
}
