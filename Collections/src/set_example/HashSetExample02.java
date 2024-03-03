package set_example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample02 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("HashSet: " + numbers);

        // Calling iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        System.out.print("HashSet using Iterator: ");
        // Accessing elements
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        System.out.println();
        System.out.println("foreach");
        for(Integer value : numbers) {
            System.out.println(value);
        }

        System.out.println("-remove");
        numbers.remove(2);
        System.out.println("after remove 2");
        System.out.println(numbers);

        System.out.println("-removeAll");
        numbers.removeAll(numbers);
        numbers.clear();
        System.out.println("after removeAll / clear");
        System.out.println(numbers);


    }
}
