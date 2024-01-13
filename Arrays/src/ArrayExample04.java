import java.util.Random;

public class ArrayExample04 {
    /*
    1 ile 50 arasında (1 ile 50 dahil) olmak üzere Random sınıfı ile 20 tane değer üretip
    bu değerleri array içerisine atınız.
    Daha sonrasında bu değerlerin toplamı ve ortalamasını bulunuz ekrana yazınız.
     */

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[20];
        int toplam = 0;
        int temp;
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = random.nextInt(50) +1;
            toplam = toplam + numbers[i];

          /*
             temp = random.nextInt(50) + 1;
             numbers[i] = temp;
             toplam = toplam + temp;*/
        }

        System.out.println("Sayıların toplamı : " + toplam);
        System.out.println("Sayıların ortalaması " + ((double)toplam/ numbers.length));
    }
}
