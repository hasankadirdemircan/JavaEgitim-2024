import java.util.Scanner;

public class DerlemeHatalari { // Derleme Hatası Çünkü Main2 isminde değil Main isminde olmalı
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) // ; koymadık ve derleme hatası
        scanner.nextInt();
        String name  = "bilgeadam";
        name.toUpperCase();

        x();// -> fonksiyondur aynı nextInt() gibi çünkü () parantez var
        x; //
        number1 = 5; // number1 tanımlı değil,  veriTipi degiskenAdi

        int number2;
        int number2 = 10; //Derleme Hatası ->  ayni degisken adi ile yeni bir degisken yaratmaya çalışıyoruz.

        int number3;
        boolean tf;
        System.out.println(tf);
        System.out.println(number3);
       /* if(number3 > 0) {

        }*/

        String number5 = "5";
        int number4 = number5;

    }
}