package static_methods;

import java.util.Random;

import static java.lang.Math.max;

public class StaticMethodExample01 {
    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt(50);
        max(3, 5);
        max(3,5);
        topla(5, 10);
        StaticMethodExample01.topla(5, 10);
    }

    public static void topla(int number1, int number2) {
        System.out.println("toplam : " + (number1 + number2));
    }
}
