import java.util.Scanner;

public class Algorithm02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2, toplam;

        System.out.println("sıfırdan farklı Birinci sayıyı giriniz");
        number1 = scanner.nextInt();
        System.out.println("Girilen birinci sayı : " + number1);

        System.out.println("sıfırdan farklı İkinci sayıyı girniz : ");
        number2 = scanner.nextInt();
        System.out.println("Girilen ikinci sayı : " + number2);
/*
        if(number1 == 0) {
            System.out.println("Maalesef siz 0 girdiniz. uygulama kapatılıyor.");
            System.exit(-1);
        }

        if(number2 == 0) {
            System.out.println("Maalesef siz 0 girdiniz. uygulama kapatılıyor.");
            System.exit(-1);
        }
*/
        if(number1 == 0 || number2 == 0) {
            System.out.println("Maalesef siz 0 girdiniz. uygulama kapatılıyor.");
            System.exit(-1);
        }
        toplam = number1 + number2;
        System.out.println("sıfırdan farklı iki sayının toplamı : " + toplam);
    }
}
