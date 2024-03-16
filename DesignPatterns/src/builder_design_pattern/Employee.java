package builder_design_pattern;

public class Employee {
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(EmployeeBuilder employeeBuilder) {
        this.firstName = employeeBuilder.firstName;
        this.lastName = employeeBuilder.lastName;;
        this.age = employeeBuilder.age;
        this.position = employeeBuilder.position;
        this.salary = employeeBuilder.salary;
    }
    private String firstName;
    private String lastName;
    private int age;
    private String position;
    private double salary;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public static class EmployeeBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String position;
        private double salary;

        /*
        required field, bu yüzden constructor oluşturup yazdım. bu iki bilgi kesin girilecek.
         */
        public EmployeeBuilder(String firstName) {
            this.firstName = firstName;
        }

        /*
        optional field, giredebilirsin girmeyede bilirsin.
         */
        public EmployeeBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /*
              optional field, giredebilirsin girmeyede bilirsin.
               */
        public EmployeeBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        /*
              optional field, giredebilirsin girmeyede bilirsin.
           */
        public EmployeeBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public EmployeeBuilder setPosition(String position) {
            this.position = position;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }

}
