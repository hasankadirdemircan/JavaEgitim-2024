package linked_hashmap_example;

import static java.util.stream.Collectors.toMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample01 {
    public static void main(String[] args) {
        Map<Integer, String> numbers = new LinkedHashMap<>();
        numbers.put(5, "b");
        numbers.put(1, "z");
        numbers.put(3, "n");
        numbers.put(4, "m");
        numbers.put(null, "c");

        /*LinkedHashMap<Integer, String> a = numbers.entrySet() //LinkedHashMap girildiği gibi tutar dataları. Eğer map'i sıralamak istersek böyle kullanabiliriz. -JAVA8
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));*/



       /* Map<Integer, String> numbers = new TreeMap<>();
        numbers.put(5, "b");
        numbers.put(1, "z");
        numbers.put(3, "n");
        numbers.put(4, "m");*/

        System.out.println(numbers);
    }
}