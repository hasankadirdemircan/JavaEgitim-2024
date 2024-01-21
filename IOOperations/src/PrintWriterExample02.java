import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample02 {
    public static void main(String[] args) {
      //  float number = 42.5f;
        String username = "bilgeadam";
        try(PrintWriter printWriter = new PrintWriter("test.txt")){
            printWriter.println("Merhaba Dünya!");
            printWriter.printf("Hoşgeldiniz %s", username);
            printWriter.println();
            printWriter.printf("Sayı: %d, Metin: %s\n", 42, "Merhaba");
            printWriter.printf("Sayı: %f, Metin: %s", 42.5f, "Merhaba");

        }catch(FileNotFoundException fileNotFoundException) {
            System.out.println("dosya işleme hatası :" + fileNotFoundException.getMessage());
        }
    }
}
