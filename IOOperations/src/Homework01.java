import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Homework01 {
    /*
    Ödev: Kullanıcı boş ifade girene kadar veya exit yazana kadar girdiği her yazıyı dosyaya yazınız
    daha sonra bu yazıyı okuyup ekrana basınız (System.println)
     */

    public static void main(String[] args) {
        try(FileWriter fileWriter2 = new FileWriter("homework.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter2)) {
            Scanner scanner = new Scanner(System.in);
            while(true)
            {
                System.out.println("Çıkış için bir şey yazmadan enter a basınız: ");
                String ifade = scanner.nextLine();
                if(ifade.isEmpty())
                    break;
                bufferedWriter.write(ifade);
                bufferedWriter.newLine();
            }
        } catch(IOException ioException) {
            System.out.println("hata : " +ioException.getMessage());
        }
    }

}
