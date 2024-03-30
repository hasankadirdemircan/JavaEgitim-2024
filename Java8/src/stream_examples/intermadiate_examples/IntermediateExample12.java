package stream_examples.intermadiate_examples;

import java.util.stream.Stream;

public class IntermediateExample12 {
    public static void main(String[] args) {
        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);
    }
}
