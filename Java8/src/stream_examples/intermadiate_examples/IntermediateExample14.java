package stream_examples.intermadiate_examples;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class IntermediateExample14 {
    public static void main(String[] args) {
        List<String> list1 = List.of("monkey", "ape", "bonobo");

        Comparator<String> comp = Comparator.comparingInt(String::length);
        Optional<String> min = list1.stream().min(comp);
        Optional<String> max = list1.stream().max(comp);

        System.out.println(min);
        System.out.println(max);
    }
}
