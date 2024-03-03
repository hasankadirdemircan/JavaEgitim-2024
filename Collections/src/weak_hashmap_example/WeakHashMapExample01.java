package weak_hashmap_example;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample01 {
    public static void main(String[] args) {
       // HashMap<String, Integer> numbers = new HashMap<>();
        Map<String, Integer> numbers = new WeakHashMap<>();
        //WeakHashMap kullandığımızda eğer referans null ise( two=null) garbage collector bu değeri weakhashmp içerisinden otomatik kaldırır(remove)

        String two = new String("Two");
        Integer twoValue = 2;
        String four = new String("Four");
        Integer fourValue = 4;

        // Inserting elements
        numbers.put(two, twoValue);
        numbers.put(four, fourValue);
        System.out.println("HashMap: " + numbers);

        // Make the reference null
        two = null;

        // Perform garbage collection
        System.gc();

        System.out.println("HashMap after garbage collection: " + numbers);

    }
}
