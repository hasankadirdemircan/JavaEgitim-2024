package function_examples;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionExample06 {

    public static void main(String[] args) {
        Function<String, Integer> parseInt = Integer::parseInt;
        Function<Integer, Integer> incrementExact = Math::incrementExact;

        Function<String, Integer> parseIntAndIncrementExact = parseInt.andThen(incrementExact);
        Function<String, Integer> compose = incrementExact.compose(parseInt);

        Stream.of("-3", "11", "25", "30", "-1", "-11").map(parseIntAndIncrementExact).forEach(System.out::println);

        System.out.println("------------");
        List<String> alpha = List.of("a a", "b b", "c c", "d d");
        Function<String, String> upperCase = String::toUpperCase;

        alpha.stream().map(upperCase).forEach(System.out::println);
        System.out.println("-------short usage-----");
        alpha.stream().map(String::toUpperCase).map(e -> e.replace(" ", "")).forEach(System.out::println);
    }
}
