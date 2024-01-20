import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CheckedExceptionExample02 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();

        // declare checked exception
        FileWriter fileWriter = new FileWriter("doc");

    }
}
