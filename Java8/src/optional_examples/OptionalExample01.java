package optional_examples;

import java.util.Optional;

public class OptionalExample01 {
    public static void main(String[] args) {
        Optional<String> emptyOptional = Optional.empty();

        Optional<String> opt1 = Optional.of("value");
        System.out.println(opt1);
        System.out.println(opt1.get());
        System.out.println(emptyOptional);
    }

    public Optional<String> doSomething(String value) {
        //process
        return Optional.empty();
    }
}
