import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayi;

        while(true) {
            System.out.println("Bir sayi giriniz : ");
            sayi = scanner.nextInt();
            toplam = toplam + sayi;
            if(sayi == 0) {
                System.out.println("0 sayısını girdiniz. Girilen sayıların toplamı hesaplanıyor.");
                break;
            }
        }

        System.out.println("0'a kadar girilen sayıların toplamı : " + toplam);
    }
}
