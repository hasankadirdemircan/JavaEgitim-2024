package tree_map_example;

import java.lang.management.ManagementFactory;
import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample13 {
    public static void main(String[] args) {
        System.out.println(ManagementFactory.getThreadMXBean().getThreadCount());
        // Creating a treemap with a customized comparator
        TreeMap<Integer, String> numbers = new TreeMap<>(new CustomComparator());

       /* numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        numbers.put("Fourth", 4);*/
        numbers.put(1, "a");
        numbers.put(2, "a");
        numbers.put(3, "a");
        numbers.put(4, "a");
        numbers.put(5, "a");
        numbers.put(6, "a");
        System.out.println("TreeMap: " + numbers);
    }

    // Creating a comparator class
    public static class CustomComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            int value =  o1.compareTo(o2);

            // elements are sorted in reverse order
            if (value > 0) {
                return -1;
            }
            else if (value < 0) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }

}
