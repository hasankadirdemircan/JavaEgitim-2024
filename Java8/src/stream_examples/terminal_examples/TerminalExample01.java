package stream_examples.terminal_examples;

import java.util.List;
import java.util.stream.Stream;

public class TerminalExample01 {
    public static void main(String[] args) {
        List<String> list1 = List.of("monkey", "gorilla", "bonobo");
        Stream<String> infinitive = Stream.generate(() -> "chimp");

        list1.stream().findAny().ifPresent(System.out::println);

        infinitive.findAny().ifPresent(System.out::println);
    }
}
