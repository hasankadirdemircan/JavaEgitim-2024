import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Homework0104 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("txt dosyasına eklemek istediklerinizi giriniz, boş metin girilirse uygulama kapanacaktır.");

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("odev01.txt"))) {
            String entered;
            while(true){
                entered = scan.nextLine();
                if (entered.isEmpty()){ // entered.equals("");
                    break;
                }
                bufferedWriter.write(entered);
                bufferedWriter.newLine();
                System.out.println("yeni değer giriniz :");
            }

        } catch (IOException ioException){
            System.out.println("hata meydana geldi. " + ioException);

        }

    }
}
