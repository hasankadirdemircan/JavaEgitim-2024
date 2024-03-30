package stream_examples.intermadiate_examples;

import java.util.List;
import java.util.stream.Stream;

public class IntermediateExample11 {
    public static void main(String[] args) {
        List.of("brown-", "bear-", "bee-").stream()
                .sorted().forEach(System.out::println);
    }
}
