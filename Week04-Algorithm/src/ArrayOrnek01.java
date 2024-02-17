import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayOrnek01 {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println(" Kac adet deger girmek istiyorsunuz");
        int sayi = scan.nextInt();

        int[] originalArray = new int[sayi];
        int[] reversedArray = new int[sayi];

        for(int i = 0; i<originalArray.length; i--) {
            originalArray[i] = r.nextInt();
        }
        System.out.println(Arrays.toString(originalArray));
        System.out.println(Arrays.toString(reversedArray));
    }
}
