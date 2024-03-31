package optional_examples;

import java.util.Optional;

public class OptionalExample05 {
    public static void main(String[] args) {
        Optional<String> string = Optional.ofNullable(null);

        System.out.println(string.map(String::length).orElse(-1));
        System.out.println(string.map(String::length).orElseGet(() -> defaultMessage()));

        System.out.println(string.map(String::length).orElseThrow(InternalError::new));
    }

    public static Integer defaultMessage() {
        return -5;
    }

    public static Integer defaultMessage(int value) {
        return -10;
    }
}
