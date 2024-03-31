package optional_examples;

import java.util.Optional;

public class OptionalExample03 {

    public static void main(String[] args) {
        Optional<String> nullable = Optional.ofNullable(null);
        System.out.println(nullable);
    }
}
