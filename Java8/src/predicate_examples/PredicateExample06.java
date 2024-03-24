package predicate_examples;

import java.util.List;

public class PredicateExample06 {
    /*
    SORU: elinizde List<String> isimler olsun, daha sonra filter kullanarak bu isimlerin length'i >=3, <=5 ve son harfi 'a' olanları filtreleyip
    Yeni bir list'e atıp daha sonra ekrana yazdırınız.
     */
    public static void main(String[] args) {
        List<String> isimler = List.of("Ferit", "Luna", "Merta", "Ana", "Lea", "Alaa", "Ada","Edma");
        List<String> filtrelenmisIsimler = isimler.stream()
                .filter(isim -> isim.length() >= 3 && isim.length() <= 5 && isim.endsWith("a"))
                .toList();

        System.out.println(filtrelenmisIsimler);
    }
}
