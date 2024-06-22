package com.example.crud.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.example.crud.helper.EmployeeHelper;
import com.example.crud.model.Employee;
import com.example.crud.repository.EmployeeRepository;
import java.time.LocalDate;
import java.time.Month;
import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeService employeeService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void sumTest() {
        //given
        int number1 = 3;
        int number2 = 5;

        //then
        int result = employeeService.sum(number1, number2);

        //assert
        assertEquals(8, result);
    }

    @Test
    public void findEmployeeById_test_successful() {
        //given
        Long id = 1L;

        when(employeeRepository.findById(id)).thenReturn(Optional.of(EmployeeHelper.employee()));

        //then
        Employee result = employeeService.findEmployeeById(id);

        //assert
        assertEquals(1, result.getId());
        assertEquals(40, result.getAge());
    }

    @Test
    public void findEmployeeById_test_fail() {
        //given
        Long id = 1L;

        when(employeeRepository.findById(id)).thenReturn(Optional.ofNullable(null));

        //then
        Exception thrown =  Assertions.assertThrows(RuntimeException.class,
                () -> employeeService.findEmployeeById(1L));

        //assert
        assertEquals("No employee for id: 1", thrown.getMessage());
    }

    @Test
    public void calculateAgeTest() {
        //given
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 8);

        //then
        int result = employeeService.calculateAge(date);

        //assert
        assertEquals(4, result);
    }

}
