package tree_map_example;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample08 {
    public static void main(String[] args) {
        // TreeMap oluştur
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Anahtar-değer çiftlerini ekle
        treeMap.put(1, "A");
        treeMap.put(3, "B");
        treeMap.put(5, "C");
        treeMap.put(7, "D");
        treeMap.put(9, "E");

        // higherKey() örneği
        System.out.println("higherKey(3): " + treeMap.higherKey(3));

        // higherEntry() örneği
        Map.Entry<Integer, String> higherEntry = treeMap.higherEntry(3);
        System.out.println("higherEntry(3): " + higherEntry.getKey() + " -> " + higherEntry.getValue());

        // lowerKey() örneği
        System.out.println("lowerKey(7): " + treeMap.lowerKey(7));

        // lowerEntry() örneği
        Map.Entry<Integer, String> lowerEntry = treeMap.lowerEntry(7);
        System.out.println("lowerEntry(7): " + lowerEntry.getKey() + " -> " + lowerEntry.getValue());

        // ceilingKey() örneği
        System.out.println("ceilingKey(4): " + treeMap.ceilingKey(4));

        // ceilingEntry() örneği
        Map.Entry<Integer, String> ceilingEntry = treeMap.ceilingEntry(4);
        System.out.println("ceilingEntry(4): " + ceilingEntry.getKey() + " -> " + ceilingEntry.getValue());

        // floorKey() örneği
        System.out.println("floorKey(6): " + treeMap.floorKey(6));

        // floorEntry() örneği
        Map.Entry<Integer, String> floorEntry = treeMap.floorEntry(6);
        System.out.println("floorEntry(6): " + floorEntry.getKey() + " -> " + floorEntry.getValue());
    }
}
