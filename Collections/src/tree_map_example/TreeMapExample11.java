package tree_map_example;

import java.util.TreeMap;

public class TreeMapExample11 {
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

        System.out.println("\nUsing tailMap() Method:");
        // Using tailMap() with default booleanValue
        System.out.println("Without boolean value: " + numbers.tailMap(3)); //DEFAULT -> TRUE

        // Using tailMap() with specified booleanValue
        System.out.println("With boolean value: " + numbers.tailMap(3, false));
        System.out.println("With boolean value: " + numbers.tailMap(3, true));

    }
}
