package tree_map_example;

import java.util.TreeMap;

public class TreeMapExample03 {
    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: " + numbers);

        // Using get()
        int value1 = numbers.get("Three");
        System.out.println("Using get(): " + value1);

        // Using get()
       /* int value2 = numbers.get("Four");  //Null pointer because can not cast null to primitive
        System.out.println("Using get(): " + value2);*/

        // Using getOrDefault()
        int value3 = numbers.getOrDefault("Five", 5);
        System.out.println("Using getOrDefault(): " + value3);

    }
}
