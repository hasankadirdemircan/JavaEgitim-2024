package return_methods;

import java.util.Random;
import java.util.Scanner;

public class ReturnTypeMethodExample01 {
    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt(50);
        int toplam = topla(3, 5);
        System.out.println("toplamı : " + toplam * 2);
    }

    public static int topla(int number1, int number2) {
        return number1 + number2;
    }
}
