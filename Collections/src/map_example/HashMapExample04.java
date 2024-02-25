package map_example;

import java.util.HashMap;

public class HashMapExample04 {
    public static void main(String[] args) {
        // create an HashMap
        HashMap<String, Integer> primeNumbers = new HashMap<>();
        // add mappings to HashMap
        primeNumbers.put("Two", 2);
        primeNumbers.put("Three", 3);
        System.out.println("Prime Numbers: " + primeNumbers);

        // create another HashMap
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 22);

        // Add all mappings from primeNumbers to numbers
        numbers.putAll(primeNumbers);
        System.out.println("Numbers: " + numbers);

    }
}
