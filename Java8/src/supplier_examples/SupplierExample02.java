package supplier_examples;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample02 {
    public static void main(String[] args) {
        Supplier<Integer> supplier01 = () -> new Random().nextInt(20); //0-19
        Stream.generate(supplier01).limit(5).forEach(System.out::println);

        System.out.println("-----------");
        Supplier<Integer> supplier02 = new Random()::nextInt;
        Stream.generate(supplier02).limit(6).filter(number -> number > 5).forEach(System.out::println);
        //   Stream.generate(new Random()::nextInt).limit(6).filter(number -> number > 5).forEach(System.out::println);
        System.out.println("-----");
        Supplier<Integer> supplier03 = SupplierExample02::createRandomNumber;
        Stream.generate(supplier03).limit(4).forEach(System.out::println);

    }

    public static Integer createRandomNumber() {
        return new Random().nextInt();
    }
}
