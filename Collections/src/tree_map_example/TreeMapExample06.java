package tree_map_example;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample06 {

    public static void main(String[] args) {
       /* Map<Integer, String> userMap = new TreeMap<>();
        userMap.put(null, "hello");
*/
        Map<Integer, String> userMap = new TreeMap<>();
        userMap.put(1, "galip");
        userMap.put(5, "yaren");
        userMap.put(3, "ali");
        userMap.put(4, "eray");
        userMap.put(2, "burak");
        userMap.put(null, "selam"); //Treemap can not accept NULL KEY
        userMap.put(0, "a");
        userMap.put(-5, "c");
       // userMap.put(6, null);
        System.out.println(userMap);
    }
}
