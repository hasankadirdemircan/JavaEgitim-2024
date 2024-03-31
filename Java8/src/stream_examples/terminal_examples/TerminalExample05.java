package stream_examples.terminal_examples;

import java.util.List;
import java.util.Optional;

public class TerminalExample05 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(3,5,6);
        List<Integer> list2 = List.of(3,5,6);

        Integer result = list1.stream().reduce(10, (a,b) -> a * b); //900
        System.out.println(result);

        Optional<Integer> result2 = list2.stream().reduce((a, b) -> a * b);
        result2.ifPresent(System.out::println);

        System.out.println(list1.stream().reduce(Integer::sum));

    }
}
