package tree_map_example;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample12 {
    public static void main(String[] args) {
        // TreeMap oluştur
        TreeMap<Integer, String> numbers = new TreeMap<>();

        // Anahtar-değer çiftlerini ekle
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        numbers.put(4, "Four");
        numbers.put(5, "Five");
        System.out.println("TreeMap: " + numbers);

        System.out.println("\nUsing subMap() Method:");
        // Using subMap() with specified boolean values
        Map<Integer, String> subMap = numbers.subMap(2, true, 4, false);
        System.out.println("subMap(2, true, 4, false):");
        for (Map.Entry<Integer, String> entry : subMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
