package stream_examples.intermadiate_examples;

import java.util.Arrays;

public class IntermediateExample10 {
    public static void main(String[] args) {
        String[] text = "you never know what you have until you clean your room".split(" ");
        Arrays.stream(text)
                .flatMap(word -> Arrays.stream(word.split("")))
                .distinct()
                .forEach(System.out::println);
    }
}
