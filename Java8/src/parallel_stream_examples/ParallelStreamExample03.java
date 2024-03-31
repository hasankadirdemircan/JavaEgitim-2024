package parallel_stream_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParallelStreamExample03 {
    public static void main(String[] args) {
        List<Integer> data = Collections.synchronizedList(new ArrayList<>());
        List.of(1,2,3,4,5,6,7,8,9).parallelStream().map(i -> {
            data.add(i);
            return i;
        }).forEachOrdered(i -> System.out.println(i + " "));
        System.out.println();
        System.out.println(data); // [9, 5, 7, 6, 3, 8, 1, 2, 4] , //[6, 5, 8, 7, 9, 3, 1, 2, 4]
    }
}
