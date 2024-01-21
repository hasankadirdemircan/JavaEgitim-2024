import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample01 {
    public static void main(String[] args) {
        //After Java8
        try(FileWriter fileWriter2 = new FileWriter("buffered_writer.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter2)) {
            bufferedWriter.write("java8 ile yazıyorum");
        } catch (IOException ioException) {
            System.out.println("hata meydana geldi : " + ioException.getMessage());
        }

        //After Java8- short usage
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("buffered_writer.txt"))) {
            bufferedWriter.write("java8 ile yazıyorum");
        } catch (IOException ioException) {
            System.out.println("hata meydana geldi : " + ioException.getMessage());
        }
    }
}
