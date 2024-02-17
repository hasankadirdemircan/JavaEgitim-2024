import java.util.Random;
import java.util.Scanner;

/*
bir methodda kullanıcadan kaç kez zar atılması gerektiğğini sorun ve alın
daha sonra main methodunda bunu yazdır.

devamıııı ->>>> bu adedi başka bir methoda gönderin ve o methodda Random ile kullanıcının istediği kadar zar atın ve bunları ekrana yazın.
 */

/*
----------------
Devamıı -> tek atışta çift zar atıyoruz.
zarların kaç kaç geldiğini ekrana basmak yerine, Array'e her çift atışın tplanımı koyunuz.
5-3
3-2
array[0] = 8
array[1] = 5

bunları koyduktan sonra bu methoddan array'i return edip, main methodunda ekrana yazınız.
 */
public class Main1 {
    public static void main(String[] args) {
        Main1 methodTekrar02 = new Main1();
        int zarAdedi = methodTekrar02.askUser();
        System.out.println( zarAdedi + "kez zar atılacak");
        int[] array = methodTekrar02.zarAtma(zarAdedi);
        for(int toplam: array) {
            System.out.println(toplam);
        }

    }
    public int askUser(){

        Scanner scan = new Scanner(System.in);
        System.out.println(" kaç adet zar atılacak?");
        int zar = scan.nextInt();

        return zar;
    }
    public int[] zarAtma(int askUser){
        Random random = new Random();
        int[] zarToplam = new int [askUser];
        for (int i = 0; i<askUser; i++) {
            int zar1 = random.nextInt(6) + 1;
            int zar2 = random.nextInt(6) + 1;

            System.out.println("atılan zar sayısı: " +i);
            System.out.println("gelen değer :  " + zar1 + " " + zar2);
            zarToplam[i] = zar1+zar2;
        }
        return zarToplam;
    }

}
