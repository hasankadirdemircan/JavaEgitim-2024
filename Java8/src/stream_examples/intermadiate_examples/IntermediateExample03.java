package stream_examples.intermadiate_examples;

import java.util.List;

public class IntermediateExample03 {
    public static void main(String[] args) {
        List.of("Hasan", "Kadir", "", "Java").stream()
                .filter(name -> !name.isEmpty())
                .forEach(System.out::println);
    }
}
