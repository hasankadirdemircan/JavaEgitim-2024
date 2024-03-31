package stream_examples.terminal_examples;

import java.util.List;
import java.util.Optional;

public class TerminalExample06 {
    public static void main(String[] args) {
        List<String> list1 = List.of("w1", "o2", "l3", "f4");
        String text = list1.stream().reduce("X", (a,b) -> a + b);
        System.out.println(text);

        Optional<String> text2 = list1.stream().reduce((a,b) -> a + b);
        System.out.println(text2);
        text2.ifPresent(System.out::println);

    }
}
