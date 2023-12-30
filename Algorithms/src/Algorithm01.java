import java.util.Scanner;

public class Algorithm01 {

    public static void main(String[] args) {
    // Klavyeden okuma yapmak için Scanner nesnesini oluştur.
        Scanner scanner = new Scanner(System.in);
        int number2;

        System.out.println("Birinci sayıyı giriniz : ");
        // nextInt() metodu ile tam sayı türünde değer okuması yapılır.
        int number1 = scanner.nextInt();
        System.out.println("Girilen birinci sayı : " + number1);

        number2 = scanner.nextInt();
        System.out.println("Girilen ikinci sayı : " + number2);
        int toplam = number1 + number2;
        System.out.println("Girilen iki sayının toplamı : " + (number1 + number2));
        System.out.println("Girilen iki sayının toplamı : " + toplam);
        System.out.println("Girilen iki sayının toplamı : " + number1 + number2); //DIKKAT!

      //  System.out.println("İki sayını toplamı : " + number1 + number2);
    }
}
