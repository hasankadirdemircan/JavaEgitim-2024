package function_examples;

import java.util.function.Function;

public class FunctionExample03 {

    public static void main(String[] args) {
        Function<Employee, String> employeeStringName = Employee::getName;
        Employee employee = new Employee("hkdemircan", 29);
        System.out.println(employeeStringName.apply(employee));
    }
}
