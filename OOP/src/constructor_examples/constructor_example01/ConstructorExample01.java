package constructor_examples.constructor_example01;

import constructor_examples.Employee;
import constructor_examples.constructor_example02.Employee;

public class ConstructorExample01 {

    public static void main(String[] args) {
        Employee e1 = new Employee("bilgeadam");
        System.out.println(e1.name);

       // e1.name = "bilgeada";
    }
}
