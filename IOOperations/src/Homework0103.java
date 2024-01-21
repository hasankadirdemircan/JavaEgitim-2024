import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Homework0103 {
    public static void main(String[] args) {

        try (PrintWriter writer = new PrintWriter(new FileWriter("file.txt"))) {

            Scanner scanner = new Scanner(System.in);

            String inputs;

            System.out.println("Boş satır girene kadar herhangi bir ifade yazabilirsiniz : ");

            while (!(inputs = scanner.nextLine()).isEmpty()) {
                writer.println(inputs);
                System.out.println("yeni ifade giriniz : ");
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
