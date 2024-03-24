package predicate_examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateExample01 {
    public static void main(String[] args) {
        Predicate<String> predicate1 = element -> element.startsWith("h");
        Predicate<String> predicate2 = (String element) -> element.startsWith("h");
        Predicate<String> predicate3 = (String element) -> {
            return element.startsWith("h");
        };

        Stream.of("Java8", "hasan", "kadir", "demircan", "hello").filter(predicate1).forEach(System.out::println);
        List<String> names = Arrays.asList("Java8", "hasan", "kadir", "demircan", "hello");
        List<String> startHNameList = names.stream().filter(predicate1).toList(); // +Java16
        List<String> startHNameList2 = names.stream().filter(predicate1).collect(Collectors.toList()); //+Java8
        System.out.println();
    }
}
