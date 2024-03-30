package function_examples;

import java.util.function.Function;

public class FunctionExample05 {
    public static void main(String[] args) {
        //function ile bir sayıyı alsın 2 ile çarpıp 10 ile toplasın ve dönsün ekrana bas.
        Function<Integer, Integer> f1 = number -> (number *2)+10;


        System.out.println(f1.apply(20));
    }
}
