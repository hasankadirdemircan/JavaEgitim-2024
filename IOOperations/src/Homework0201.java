import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Homework0201 {
    /*
    Ödev2: Kullanıcıdan 20 adet tam sayı alınsın.
    Alınan bu tam sayılarıda dosyaya yazalım.
    Daha sonra okuyup toplamını ve ortalamasını ekrana basalım.
     */

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        String dosyaIsim = "odev02.txt";
        System.out.println("20 adet sayı giriniz");
        double toplam = 0;
        int n = 2;
        int sayac = 0;
        String girilenSayi;
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dosyaIsim))) {
            for (int i=1; i<=n; i++){
                System.out.println(i + ". sayıyı giriniz: ");
                girilenSayi = scanner.nextLine();
                bufferedWriter.write(girilenSayi);
                bufferedWriter.newLine();
            }

        }catch (IOException ioException) {
            System.out.println("hata meydana geldi. " + ioException);
        }

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(dosyaIsim))) {
            String data;
            while((data = bufferedReader.readLine()) != null) {
                toplam = toplam + Integer.parseInt(data);
                sayac++; // sayac = sayac + 1
            }
        }catch (IOException ioException) {
            System.out.println("hata meydana geldi. " + ioException);
        }

        System.out.println("toplam : " + toplam);
        System.out.println("ortalama : " + toplam / sayac);
    }
}
