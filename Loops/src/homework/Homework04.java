package homework;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Asal sayı kontrolü için sayı giriniz: ");
        int number = scanner.nextInt();
        int sayac = 2;
        boolean asalMi = true;
        do {
            if(number % sayac == 0 && sayac != number) {
                asalMi = false;
            }
            sayac++;
        }while(sayac < number);

       if(asalMi) {
           System.out.println("girdiğiniz : " + number + " asaldır.");
       }else {
           System.out.println("girdiğiniz : " + number + " asal değildir.");
       }
    }
}
