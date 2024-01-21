import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProcessWithJava8 {
    public static void main(String[] args) throws IOException {

        // Before Java8
        FileWriter fileWriter = null;

        String fileName = "file_writer.txt";
        try {
            fileWriter = new FileWriter(fileName,false); // "first_file.txt", true -> default değeri false'dur.
            fileWriter.write("merhaba file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            fileWriter.close();
        }

        //After Java8
        try(FileWriter fileWriter1 = new FileWriter("file_writer2.txt")) {
            fileWriter1.write("java8 ile yazıyorum");
        } catch (IOException ioException) {
            System.out.println("hata meydana geldi : " + ioException.getMessage());
        }


        //After Java8
        try(FileWriter fileWriter2 = new FileWriter("buffered_writer.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter2)) {
            bufferedWriter.write("java8 ile yazıyorum");
        } catch (IOException ioException) {
            System.out.println("hata meydana geldi : " + ioException.getMessage());
        }
    }
}
