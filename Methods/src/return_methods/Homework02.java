package return_methods;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");

        int girilenSayi = scanner.nextInt();

        int toplam = sayiToplami(girilenSayi);

        System.out.println(" 1 den " + girilenSayi + "' a Kadar Sayıların Toplamı : " + toplam);
    }

    public static int sayiToplami(int n) {

        int toplam = 0;

        for (int i = 1; i <= n; i++) {

            toplam += i;
        }

        return toplam;
    }
}
