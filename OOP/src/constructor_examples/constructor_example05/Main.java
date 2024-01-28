package constructor_examples.constructor_example05;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.age = 40;
        customer.address = "Ankara";
        customer.name = "yaren";
        customer.birthdate = Date.from(Instant.from(LocalDate.now()));
    }
}
