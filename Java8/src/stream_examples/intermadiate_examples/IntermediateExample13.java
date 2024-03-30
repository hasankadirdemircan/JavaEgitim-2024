package stream_examples.intermadiate_examples;

import java.util.List;
import java.util.stream.Stream;

public class IntermediateExample13 {
    public static void main(String[] args) {
        long count = List.of("k1", "k2", "k3").stream().count();
        System.out.println(count);
    }
}
