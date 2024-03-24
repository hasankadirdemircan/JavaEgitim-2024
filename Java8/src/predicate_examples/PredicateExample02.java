package predicate_examples;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateExample02 {
    public static void main(String[] args) {
        //Java9
        List<String> myList = List.of("Java8", "hasan", "kadir", "demircan", "hello");
        Stream<String> myStream = myList.stream();
        Predicate<String> predicate1 = element -> element.length() > 5;
        myStream.filter(predicate1).forEach(System.out::println);

        //kısa ve önerilen
        myList.stream().filter(predicate1).forEach(System.out::println);

        //ileride
        myList.stream().filter(element -> element.length() > 5).forEach(System.out::println);

        myList.stream().filter(e -> e.length() == 5).forEach(System.out::println);
        List<String> namesSize5 = myList.stream().filter(e -> e.length() == 5).toList();
        System.out.println("---");
        namesSize5.forEach(System.out::println);
        //before java8
        for(String name : namesSize5) {
            System.out.println(name);
        }
    }
}
