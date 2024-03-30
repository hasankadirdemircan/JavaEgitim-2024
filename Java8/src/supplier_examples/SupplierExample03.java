package supplier_examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.function.Supplier;

public class SupplierExample03 {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
    public static void main(String[] args) {
        Supplier<String> currentDateTime = () -> LocalDateTime.now().toString();
        System.out.println(currentDateTime.get());

        Supplier<LocalDateTime> supplier02 = LocalDateTime::now;
        System.out.println(supplier02.get());

        Supplier<String> supplier03 = () -> dtf.format(LocalDateTime.now());
        System.out.println(supplier03.get());
    }
}
