package supplier_examples;

import java.util.Optional;
import java.util.function.Supplier;

public class SupplierExample07 {
    public static void main(String[] args) {
        Employee employee = findNameById(1L).orElseGet(() -> factory(() -> new Employee(2L, "java8", 2020)));

        System.out.println(employee.toString());
    }

    public static Employee factory(Supplier<? extends Employee> s) {
        Employee employee = s.get();
        return employee;
    }

    public static Optional<Employee> findNameById(Long id) {
        Employee employee = null;
        if(id == 1) {
            employee = factory(() -> new Employee(1L, "java8", 29));
        }

        return Optional.ofNullable(employee);
    }
}
