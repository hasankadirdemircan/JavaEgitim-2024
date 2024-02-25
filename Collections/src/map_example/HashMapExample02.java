package map_example;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample02 {

    public static void main(String[] args) {
        Map<Integer, String> userMap = new HashMap<>();
        userMap.put(123, "hasan");
        userMap.put(321, null);

        System.out.println();
        userMap.putIfAbsent(321, "bilgeadam");
        userMap.putIfAbsent(321, "asdsadasd");
        System.out.println();
        userMap.get(543);
        userMap.getOrDefault(543, "defaultValue");
        System.out.println();
    }
}
