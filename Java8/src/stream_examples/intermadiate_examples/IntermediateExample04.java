package stream_examples.intermadiate_examples;

import java.util.List;

public class IntermediateExample04 {
    public static void main(String[] args) {
        List.of("Hasan","Java", "Kadir", "", "Java", "JAva").stream()
                .filter(e -> !e.isEmpty())
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);
    }
}
