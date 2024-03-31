package parallel_stream_examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample06 {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).parallelStream().map(i -> {
            data.add(i); // // AVOID STATEFUL LAMBDA EXPRESSIONS!
            return i;
        }).forEachOrdered(i -> System.out.print(i + " "));

// 1 2 3 4 5 6 7 8
// [1, 3, 4, 5, 2] ->missing !
        System.out.println();
        System.out.println(data);
    }
}
