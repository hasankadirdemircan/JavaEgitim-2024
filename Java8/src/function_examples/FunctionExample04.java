package function_examples;

import java.util.function.Function;

public class FunctionExample04 {
    public static void main(String[] args) {
        Function<String, Integer> f1 = str -> Utility.calculateLengthOfTemp(str);
       // Function<String, Integer> f1 = Utility::calculateLengthOfTemp;
        System.out.println(f1.apply("bilgeadam"));

        Function<String, Integer> f2 = String::length;
        System.out.println(f2.apply("bilgeadam"));
    }
}
