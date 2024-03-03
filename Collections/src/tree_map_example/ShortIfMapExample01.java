package tree_map_example;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class ShortIfMapExample01 {
    public static void main(String[] args) {
        // TreeMap oluştur
        TreeMap<Integer, String> treeMap = new TreeMap<>();
      //  treeMap.put(3, "C");

        System.out.println("original");
        System.out.println(treeMap);

       // Map.Entry<Integer, String> lastEntry1 = treeMap.isEmpty() ? null : treeMap.pollLastEntry();
        Map.Entry<Integer, String> lastEntry2 = treeMap.lastEntry() == null ? null : treeMap.pollLastEntry();
        Map.Entry<Integer, String> lastEntry3 = Objects.isNull(treeMap.lastEntry()) ? null : treeMap.pollLastEntry();
        Map.Entry<Integer, String> lastEntry4 = Objects.nonNull(treeMap.lastEntry()) ? treeMap.pollLastEntry() : null;
        System.out.println(lastEntry2);

        System.out.println("result");
        System.out.println(treeMap);
    }
}
