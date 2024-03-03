package set_example;

import java.util.LinkedHashSet;

public class LinkedHashSetExample03 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("LinkedHashSet: " + numbers);

        // Using the remove() method
        boolean value1 = numbers.remove(4);
        System.out.println("Is 4 removed? " + value1);

        // Using the remove() method
        boolean value4 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value4);

       // numbers.clear();
        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);
    }
}
