package while_example;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        //
        Scanner oku = new Scanner(System.in);

        String kAdi = "Kullanıcı Adınızı Girin: ";
        String kSifre = "Şifrenizi Giriniz: ";
        int gHak = 3;
        while (gHak > 0) {
            System.out.print("Kullanıcı Adı: ");
            String kullaniciAdi = oku.nextLine();
            System.out.print("Şifreniz: ");
            String sifre = oku.nextLine();

            if (kullaniciAdi.equals(kAdi) && sifre.equals(kSifre)) {
                System.out.println("HOŞGELDİN BAŞKAN!");
                break;
            } else {
                gHak--;
                System.out.println("Düzgin gir. Kalan hakkın: " + gHak);
            }
        }

        if (gHak == 0) {
            System.out.println("Tükenti Aktı Ömrün.... Program sonlandırılıyor.");
        }
    }
}
