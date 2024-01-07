package while_example;

import java.util.Random;

public class Homework02 {
    /*
    Bu sefer örneğimiz üzerinde bilgisayarın iki zar atmasını ve bu zarların her ikisinin de 6 gelmesi durumuna kadar döngüye devam etmesini isteyelim. Bu işlemi gerçekleştirebilmek için Random() sınıfından yardım alacağız.
     */
    public static void main(String[] args) {
        int zar1, zar2, deneme = 0;
        boolean zarAt = true;
        Random random = new Random();

        while (true) {
            zar1 = random.nextInt(6)+1;
            zar2 = random.nextInt(6)+1;
            deneme++;
            System.out.println(deneme+". deneme -> zar1 : " + zar1 + " , zar2 : " + zar2);

            if(zar1 == 6 && zar2 == 6) {
                System.out.println(deneme+". denemede 6 6 yı buldunuz, -> zar1 : " + zar1  + " zar2 : " + zar2);
               break;
            }
        }

 /*
        //2. Yöntem
        while (zarAt) {
            zar1 = random.nextInt(6)+1;
            zar2 = random.nextInt(6)+1;
            deneme++;
            System.out.println(deneme+". deneme -> zar1 : " + zar1 + " , zar2 : " + zar2);

            if(zar1 == 6 && zar2 == 6) {
                System.out.println(deneme+". denemede 6 6 yı buldunuz, -> zar1 : " + zar1  + " zar2 : " + zar2);
                zarAt = false;
            }
        }
*/
    }
}
