package parallel_stream_examples;

import java.util.List;

public class ParallelStreamExample01 {
    public static void main(String[] args) {
        System.out.println(List.of(1,2,3,4,5,6).parallelStream().count());
    }
}
