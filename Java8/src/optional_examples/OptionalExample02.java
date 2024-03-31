package optional_examples;

import java.util.Optional;

public class OptionalExample02 {
    public static void main(String[] args) {
        Optional<String> nullStr = Optional.ofNullable(null);
       // boolean tf = nullStr.get().equals("value"); .NullPointerException
        nullStr.ifPresent(System.out::println); // .NullPointerException should be ->  Optional.ofNullable(null);
    }
}
