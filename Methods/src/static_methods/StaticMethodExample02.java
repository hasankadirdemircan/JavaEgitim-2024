package static_methods;

import java.util.Random;

import static java.lang.Math.max;

public class StaticMethodExample02 {
    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt(50);
        StaticMethodExample02 myClass = new StaticMethodExample02();
        myClass.topla(5, 10);
        cikar(5, 3); // ayni  class icerisinde bu yüzden ClassName.methodName gerek yok
        StaticMethodExample02.cikar(5, 3); //ClassName.methodName

    }

    public void topla(int number1, int number2) {
        System.out.println("toplam : " + (number1 + number2));
    }

    public static void cikar(int number1, int number2) {
        System.out.println("cikarim : " + (number1 - number2));
    }
}
