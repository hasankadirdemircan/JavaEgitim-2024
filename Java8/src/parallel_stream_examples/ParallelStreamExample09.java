package parallel_stream_examples;

import java.util.Arrays;

public class ParallelStreamExample09 {
    public static void main(String[] args) {
        Integer findAny1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().findAny().get();
        System.out.println(findAny1);

        Integer findAny2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).parallelStream().findAny().get();
        System.out.println(findAny2);
    }
}
