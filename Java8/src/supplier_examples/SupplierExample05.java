package supplier_examples;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample05 {
    public static void main(String[] args) {
        /*
    Supplier ile Random methodunu kullanarak, 10 adet 0-99 arası sayı üretiniz, bunlardan >10 olanlarını bir List'eye atınız daha sonrasında ekrana basınız.
     */
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);

        List<Integer> largerThanTenList = Stream.generate(randomSupplier)
                .limit(10)
                .filter(n -> n > 10)
                .toList();
        largerThanTenList.forEach(System.out::println);
    }
}
