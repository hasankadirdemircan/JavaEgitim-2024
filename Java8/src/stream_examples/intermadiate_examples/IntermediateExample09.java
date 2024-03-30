package stream_examples.intermadiate_examples;

import java.util.Collection;
import java.util.List;

public class IntermediateExample09 {

    public static void main(String[] args) {
        List<List<Integer>> nestedList = List.of(
                List.of(1,2,3),
                List.of(4,5),
                List.of(6,7,8)
        );

       // List.of(1,2,3,4,5,6,7,8);
        System.out.println(nestedList);

        List<Integer> flatList = nestedList.stream().flatMap(List::stream).toList();
        System.out.println(flatList);
    }
}
