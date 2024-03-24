package predicate_examples;

import java.util.List;

public class PredicateExample08 {
    public static void main(String[] args) {
        /*
        SORU: List<Integer> ınız olsun, tek sayıları bulup list'e atıp ekrana yazsın.
         */
        List<Integer> myList = List.of(3, 5, 10, 15, 9);
        List<Integer> newList = myList.stream()
                .filter(element -> element % 2 != 0)
                .sorted()
                .toList();
        newList.forEach(System.out::println);
    }
}
