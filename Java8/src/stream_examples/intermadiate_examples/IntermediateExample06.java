package stream_examples.intermadiate_examples;

import java.util.List;

public class IntermediateExample06 {
    public static void main(String[] args) {
        List.of("Hasan","Java", "Kadir", "", "Java", "JAva").stream()
                .map(String::length)
                .forEach(System.out::println);
    }
}
