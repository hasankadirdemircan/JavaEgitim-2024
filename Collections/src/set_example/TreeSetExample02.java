package set_example;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample02 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Calling iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        System.out.print("TreeSet using Iterator: ");
        // Accessing elements
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        //foreach
        System.out.println("foreach");
        for(Integer value: numbers) {
            System.out.println(value);
        }

    }
}
