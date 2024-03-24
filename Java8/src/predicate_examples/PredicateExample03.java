package predicate_examples;

import java.util.List;

public class PredicateExample03 {
    public static void main(String[] args) {
        //SORU: bir tane List Integer oluşturunuz, bu List integer içerisinde 5-10 tane number olsun, bu number'lar negatif ve pozitif olsun.
        //daha sonra java8 stream predicate'i kullanarak pozitif olanları bir yeni List'e atınız daha sonra bunları ekrana basınız.

        List<Integer> listOfNumber = List.of(-1,1,0,-2,5,3,-5,-7);
        List<Integer> pozitif = listOfNumber.stream().filter(element -> element >0).toList();
        pozitif.forEach(System.out::println);
    }
}
