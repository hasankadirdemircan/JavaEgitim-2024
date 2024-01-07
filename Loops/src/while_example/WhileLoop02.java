package while_example;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.println("Lütfen sıfırdan farklı bir sayı giriniz");
            number = scanner.nextInt();
            if(number != 0) {
                break;
            }
        }
        System.out.println("program kapatılıyor.");
    }
}
