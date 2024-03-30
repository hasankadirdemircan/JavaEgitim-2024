package stream_examples.terminal_examples;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TerminalExample03 {
    public static void main(String[] args) {
        List<String> list1 = List.of("monkey", "2", "chimp");

        Stream<String> infinitive = Stream.generate(() -> "chimp");
        Stream<String> infinitive2 = Stream.generate(() -> "chimp");

        Predicate<String> predicate = x -> Character.isLetter(x.charAt(0));

        System.out.println(list1.stream().anyMatch(predicate)); //true
        System.out.println(list1.stream().allMatch(predicate)); //false
        System.out.println(list1.stream().noneMatch(predicate)); //false

        System.out.println(infinitive.anyMatch(predicate));
        System.out.println(infinitive2.noneMatch(predicate));
      //  System.out.println(infinitive2.allMatch(predicate)); //sonsuz döngüye girer çünkü allMatch için Stream.generate() methodu sonlanması gerekir ama burada sonsuz kez değer üretiyor.
    }
}
