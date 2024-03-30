package function_examples;

import java.util.function.Function;

public class FunctionExample01 {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunction = e -> e.length();
        Function<String, Integer> lengthFunction2 = (String e) -> e.length();

        int result1 = lengthFunction.apply("merhaba");
        int result2 = lengthFunction.apply("helloworld!");
        int result3 = lengthFunction.apply("functionalinterface");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
