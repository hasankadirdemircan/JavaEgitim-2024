package parallel_stream_examples;

import java.util.Arrays;

public class ParallelStreamExample10 {
    public static void main(String[] args) {
        Arrays.asList(1, 2, 3, 4, 5, 6, 7).stream().forEach(s -> System.out.print(s + " "));

        System.out.println();
// the results are no longer ordered or predictable.
        Arrays.asList(1, 2, 3, 4, 5, 6, 7).parallelStream().forEach(s -> System.out.print(s + " "));

        System.out.println();
        Arrays.asList(1, 2, 3, 4, 5, 6, 7).parallelStream().forEachOrdered(s -> System.out.print(s + " "));
    }
}
