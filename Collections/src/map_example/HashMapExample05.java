package map_example;

import static java.util.Map.Entry.comparingByKey;
import static java.util.stream.Collectors.toMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample05 {
    public static void main(String[] args) {
        Map<Integer, String> userMap = new HashMap<>();
        userMap.put(1, "galip");
        userMap.put(5, "yaren");
        userMap.put(3, "ali");
        userMap.put(4, "eray");
        userMap.put(2, "burak");
       // userMap.put(null, "selam");
        userMap.put(0, "a");

        userMap.containsKey(5);
        System.out.println(userMap.containsKey(55));

        System.out.println("-----before");
        System.out.println(userMap);
        userMap.replaceAll((key, value) -> value.toUpperCase());

        System.out.println("-----after");
        System.out.println(userMap);

        System.out.println("values");
        for (String value : userMap.values()) {
            System.out.println(value);
        }

        System.out.println("keys");
        for (Integer key : userMap.keySet()) {
            System.out.println(key);
        }

        System.out.println("get");
        String value = userMap.get(9);
        System.out.println(value);

     /*   Map<Integer, String> a = userMap
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(comparingByKey()))
                .collect(toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
*/
        System.out.println("reverse");
        System.out.println(userMap);
    }
}
