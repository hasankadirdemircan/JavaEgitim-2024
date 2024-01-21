import java.io.File;
import java.io.IOException;

public class FileProcessExample02 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        System.out.println(file.isFile());
        System.out.println(file.exists());
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(file.exists());
    }
}
