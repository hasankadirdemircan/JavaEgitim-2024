package builder_design_pattern;

public class Main {
    public static void main(String[] args) {
        Employee kadir = new Employee.EmployeeBuilder("kadir") //firstname zorunlu çünkü EmployeeBuilder constructorda yazdık.
                .setAge(29)
                .setSalary(1)
                .setLastName("demircan")
                .build();

        System.out.println(kadir.toString());


    }
}
