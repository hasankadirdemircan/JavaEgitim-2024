package stream_examples.source_examples;

import java.util.stream.IntStream;

public class SourceExample02 {
    public static void main(String[] args) {
        IntStream.iterate(10, i -> i+5)
                .limit(6)
                .forEach(System.out::println);
    }
}
