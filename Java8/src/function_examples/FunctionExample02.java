package function_examples;

import java.util.function.Function;

public class FunctionExample02 {
    public static void main(String[] args) {
        Function<String, Integer> f1 = str -> Integer.parseInt(str);

        Function<String, Integer> f2 = Integer::parseInt;

        System.out.println(f1.apply("800"));
        System.out.println(f2.apply("800") + 100);
        System.out.println("800" + 100);

        Function<Integer, Integer> f3 = str -> Math.abs(str);
        Function<Integer, Integer> f4 = Math::abs;

        System.out.println(f3.apply(-400));
        System.out.println(f4.apply(-400));
    }
}
