package consumer_examples;

import java.util.function.Consumer;

public class ConsumerExample01 {
    //Değer alıp, değer döndürmüyorsa bu consumer'dır. Örneğin, System.out.println
    public static void main(String[] args) {
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());

        printUpperCase.accept("merhaba");


        Consumer<Integer> c1 = x -> System.out.println(x * 2);
        c1.accept(1);
    }
}
