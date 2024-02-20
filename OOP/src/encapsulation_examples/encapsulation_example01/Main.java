package encapsulation_examples.encapsulation_example01;

import java.util.Scanner;

public class Main {
    private int size = 10;

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setBudget(500);
        customer.setId(1);
        customer.setGender("female");
        customer.setPassword("123456");

        System.out.println(customer.getBudget());
        System.out.println(customer.getGender());

        customer.setBudget(10000);
        System.out.println(customer.getBudget());

    }
}
