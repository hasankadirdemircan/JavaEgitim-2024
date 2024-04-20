import java.util.Random;

public class A {
    public static void main(String[] args) {
        int denemeSayisi = 0;
        int sonuc1, sonuc2;

        // Random sınıfını kullanarak zar atma
        Random rand = new Random();

        // İki zar da 6 gelene kadar döngüyü çalıştır
        do {
            sonuc1 = zarAt(rand);
            sonuc2 = zarAt(rand);
            denemeSayisi++;
            System.out.println("deneme sayısı="+denemeSayisi+"   sonuc= " +sonuc1 +"-"+ sonuc2);
        } while (sonuc1 != 6 || sonuc2 != 6);

        System.out.println("Her iki zar da 6 geldi!");
        System.out.println("Deneme Sayısı: " + denemeSayisi);
    }

    // Zar atma işlemini gerçekleştiren metod
    public static int zarAt(Random rand) {
        return rand.nextInt(6) + 1; // Zar 1 ile 6 arasında değer alır
    }
}
