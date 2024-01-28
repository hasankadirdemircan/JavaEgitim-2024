package garbage_collector;

import java.util.Date;

public class GarbageCollectorExample04 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Memory : " + runtime.totalMemory());
        System.out.println("Free Memory : " + runtime.freeMemory());
        GarbageCollectorExample04 garbageCollectorExample04 = new GarbageCollectorExample04();
        int sum = garbageCollectorExample04.sum(4,5);
        Date d = null;
        for(int i=0; i<1000000000; i++) {
            d = new Date();
            d = null;
        }

        System.out.println("After free memory : " + runtime.freeMemory());
        System.gc();

        System.out.println("After GC free memory : " + runtime.freeMemory());
    }

    public int sum(int number1, int number2) {
        return number1 + number2;
    }
}
