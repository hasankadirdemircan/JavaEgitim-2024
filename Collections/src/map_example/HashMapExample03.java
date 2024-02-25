package map_example;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample03 {
    public static void main(String[] args) {
        Map<Integer, String> userMap = new HashMap<>();
        userMap.put(1, "galip");
        userMap.put(2, "yaren");
        userMap.put(3, "ali");
        userMap.put(4, "eray");
        userMap.put(5, "burak");
        userMap.put(null, "selam");
        userMap.put(6, null);
        userMap.put(null, null);

        userMap.replace(1, "hasan");
        userMap.replace(2, "yaren", "bilgeadamcom");
        userMap.replace(2, "aaa", "bilgeadamcom");
        System.out.println();
        userMap.get(2);
        for(Map.Entry<Integer, String> entry: userMap.entrySet()) {
            System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
        }
    }
}
