package com.example.crud.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.crud.helper.EmployeeHelper;
import com.example.crud.model.Employee;
import com.example.crud.service.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class EmployeeControllerTest {

    @Mock
    private EmployeeService employeeService;

    @InjectMocks
    private EmployeeController employeeController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void createEmployee() {
        //given
        Employee employee = EmployeeHelper.employee();
        Employee withoutId = EmployeeHelper.employeeWithoutId();
        when(employeeService.createEmployee(withoutId)).thenReturn(employee);

        //then
        Employee result = employeeController.createEmployee(withoutId);

        //assert
        assertEquals(employee, result);
        assertEquals(employee.getAge(), result.getAge());
        verify(employeeService, Mockito.times(1)).createEmployee(withoutId); //createEmployee methodunun kaç kez çağırılacağının testi
    }

}
