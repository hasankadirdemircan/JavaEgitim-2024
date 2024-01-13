package homework;

import java.util.Scanner;

public class Homework09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Asal çarpanını bulmamı istediğin sayıyı gir : ");
        int number = scanner.nextInt();
        int sayac = 2;
        do {

            while(number % sayac == 0) {
                System.out.println("bölen : " + sayac);
                number /= sayac;
            }
            sayac++;
        }while(sayac <= number);
    }
}
