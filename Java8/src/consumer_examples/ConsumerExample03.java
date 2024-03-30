package consumer_examples;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample03 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);
        Consumer<Integer> divideByTwo = number -> {
            System.out.println(number + " divided by 2 is : " + (number/2));
        };

        numbers.forEach(divideByTwo);
    }
}
