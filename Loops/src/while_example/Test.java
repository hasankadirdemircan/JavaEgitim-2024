package while_example;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random rastgele = new Random();
        int sayac = 0;
        while (sayac <= 100) {
            System.out.println( rastgele.nextInt(3)+1);
            sayac++;
        }
    }
}
