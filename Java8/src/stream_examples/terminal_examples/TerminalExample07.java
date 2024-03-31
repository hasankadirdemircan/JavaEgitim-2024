package stream_examples.terminal_examples;

import java.util.List;
import java.util.Optional;

public class TerminalExample07 {
    public static void main(String[] args) {
        List<String> list1 = List.of("w", "o", "l", "f");
        String text = list1.stream().reduce("X", (a,b) -> a + b + "--");
        System.out.println(text);
    }
}
