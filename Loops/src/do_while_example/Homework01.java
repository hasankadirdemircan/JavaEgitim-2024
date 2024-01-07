package do_while_example;

import java.util.Random;

public class Homework01 {
    public static void main(String[] args) {
        int zar1, zar2, deneme = 0;
        boolean zarAt = true;
        Random random = new Random();

        //1. Yöntem
        /*
        do {
            zar1 = random.nextInt(6)+1;
            zar2 = random.nextInt(6)+1;
            deneme++;
            System.out.println(deneme+". deneme -> zar1 : " + zar1 + " , zar2 : " + zar2);
        } while(!(zar1 == 6  && zar2 == 6));

         */


        //2. yöntem
        /*
        do {
            zar1 = random.nextInt(6)+1;
            zar2 = random.nextInt(6)+1;
            deneme++;
            System.out.println(deneme+". deneme -> zar1 : " + zar1 + " , zar2 : " + zar2);
            if(zar1 == 6 && zar2 == 6) {
                zarAt = false;
            }
        }while(zarAt);
         */

        //3. Yöntem
        do {
            zar1 = random.nextInt(6)+1;
            zar2 = random.nextInt(6)+1;
            deneme++;
            System.out.println(deneme+". deneme -> zar1 : " + zar1 + " , zar2 : " + zar2);
            if(zar1 == 6 && zar2 == 6) {
               break;
            }
        }while(true);

    }
}
