package weak_hashmap_example;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample02 {
    public static void main(String[] args) {
        Map<Key, String> weakHashMap = new WeakHashMap<>();

        Key key1 = new Key("Key1");
        Key key2 = new Key("Key2");

        // Add keys and values
        weakHashMap.put(key1, "Value1");
        weakHashMap.put(key2, "Value2");

        // Access values
        System.out.println("Value for key1: " + weakHashMap.get(key1));
        System.out.println("Value for key2: " + weakHashMap.get(key2));

        // Make keys null to allow garbage collector to collect them
        key1 = null;
       // key2 = null;

        // Trigger garbage collection to collect weak references
        System.gc();

        // Access values after collection
        System.out.println("Value for key1 after GC: " + weakHashMap.get(key1));
        System.out.println("Value for key2 after GC: " + weakHashMap.get(key2));
    }
}