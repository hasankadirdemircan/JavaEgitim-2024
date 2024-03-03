package enum_map_example;

import java.util.EnumMap;

public class EnumMapExample02 {


        public static void main(String[] args) {

            // Creating an EnumMap of the Size enum
            EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);
            sizes.put(Size.SMALL, 28);
            sizes.put(Size.MEDIUM, 32);
            sizes.put(Size.LARGE, 36);
            sizes.put(Size.EXTRALARGE, 40);
            sizes.put(Size.A, 12);

          //  Size.EXTRALARGE.ordinal();
            System.out.println("EnumMap: " + sizes);

            // Using the remove() Method
            int value = sizes.remove(Size.MEDIUM);
            System.out.println("Removed Value: " + value);

            boolean result = sizes.remove(Size.SMALL, 28);
            System.out.println("Is the entry {SMALL=28} removed? " + result);

            System.out.println("Updated EnumMap: " + sizes);
        }
}
