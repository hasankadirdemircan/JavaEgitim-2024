package predicate_examples;

import java.util.List;

public class PredicateExample07 {
    public static void main(String[] args) {
        /*
        SORU: Integer değerlerimiz olsun List<Integer> daha sonrasında bu değerlerin 2 katı > 20 ise yeni bir List'e atsın ve daha sonra ekrana yazsın.
         */
        List<Integer> sayilar = List.of(1, 2, 3, 5, 8, 13, 21);
        List<Integer> filtrelenmisSayilar = sayilar.stream()
                .filter(sayi -> sayi * 2 < 20)
                .toList();
        System.out.println(filtrelenmisSayilar);
    }
}
