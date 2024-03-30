package stream_examples.intermadiate_examples;

import java.util.List;

public class IntermediateExample05 {
    public static void main(String[] args) {
        List.of(0,1,2,3,4,5,6,7,8,9).stream()
                .skip(3)
                .limit(2)
                .forEach(System.out::println);
    }
}
