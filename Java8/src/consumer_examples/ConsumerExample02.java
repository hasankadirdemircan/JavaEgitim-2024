package consumer_examples;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerExample02 {
    public static void main(String[] args) {
        System.out.println("--");
        Consumer<Integer> c1 = x -> System.out.println(x * 2);
        Stream.of(1,2).forEach(c1);

        System.out.println("--");
        Stream.of(1,2,3).forEach(x -> System.out.println(x * 2));

        System.out.println("--");
        List<Integer> numbers = List.of(1,2,3,4);
        numbers.stream().forEach(c1);


        System.out.println("--");
        Stream.of(1,2).forEach(System.out::println);
    }
}
