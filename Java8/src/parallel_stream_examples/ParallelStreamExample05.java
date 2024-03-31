package parallel_stream_examples;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamExample05 {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30).parallelStream().map(i -> {
            data.add(i);
            return i;
        }).forEachOrdered(i -> System.out.println(i + " "));

        System.out.println();
        System.out.println(data);
        System.out.println(data.size());
    }
}
