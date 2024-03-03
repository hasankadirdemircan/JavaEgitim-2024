package tree_map_example;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample09 {
    public static void main(String[] args) {
        // TreeMap oluştur
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Anahtar-değer çiftlerini ekle
        treeMap.put(3, "C");
        treeMap.put(1, "A");
        treeMap.put(5, "E");
        treeMap.put(2, "B");
        treeMap.put(4, "D");

        System.out.println("original");
        System.out.println(treeMap);
        // pollFirstEntry() örneği
        Map.Entry<Integer, String> firstEntry = treeMap.pollFirstEntry();
        if (firstEntry != null) {
            System.out.println("pollFirstEntry(): " + firstEntry.getKey() + " -> " + firstEntry.getValue());
        } else {
            System.out.println("pollFirstEntry(): TreeMap is empty.");
        }

        // pollLastEntry() örneği
        treeMap.lastEntry();

        if(treeMap.lastEntry() != null) {
            treeMap.pollLastEntry();
        }
        Map.Entry<Integer, String> lastEntry = treeMap.pollLastEntry();
        if (lastEntry != null) {
            System.out.println("pollLastEntry(): " + lastEntry.getKey() + " -> " + lastEntry.getValue());
        } else {
            System.out.println("pollLastEntry(): TreeMap is empty.");
        }

        // Kalan çiftleri göster
        System.out.println("Remaining entries in TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
