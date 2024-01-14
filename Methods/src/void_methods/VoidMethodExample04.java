package void_methods;

import java.util.Scanner;

public class VoidMethodExample04 {

    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adınızı giriniz: ");
        String name = scanner.nextLine();
        sum(number1, number2, name);
    }

    public static void sum(int num1, int num2, String name) {
        System.out.println("Merhaba : " + name + " iki sayının toplamı : " + (num1 + num2));
    }
}