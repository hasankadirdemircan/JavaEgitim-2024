import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Homework0102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String girilen = "";
        //After Java8- short usage
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("deneme.txt"))) {
            do{
                System.out.println("Dosyaya yazılacak değerleri girin.");
                girilen = scanner.nextLine();
                bufferedWriter.write(girilen);
                bufferedWriter.newLine();
            }while(!girilen.isEmpty());

        } catch (IOException ioException) {
            System.out.println("boş girme meydana geldi : " + ioException.getMessage());
        }

    }
}
