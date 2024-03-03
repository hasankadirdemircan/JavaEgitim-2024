package enum_map_example;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class HashMapEnumExample {
    public static void main(String[] args) {
        Map<Size, Integer> sizes = new HashMap<>();
        sizes.put(Size.SMALL, 28);
        sizes.put(Size.MEDIUM, 32);
        sizes.put(Size.LARGE, 36);
        sizes.put(Size.EXTRALARGE, 40);
        sizes.put(Size.A, 12);

        System.out.println("sizes : " + sizes);
    }
}
