package stream_examples.terminal_examples;

import java.util.List;

public class TerminalExample09 {
    public static void main(String[] args) {
        StringBuilder word = List.of("w", "o", "l", "f").stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(word);
    }
}
