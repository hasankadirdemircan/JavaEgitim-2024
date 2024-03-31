package exception_handling_examples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionHandlingExample02 {

    public static void main(String[] args) {
        // Before Java7
        FileWriter fileWriter = null;

        String fileName = "file_writer.txt";
        try {
            fileWriter = new FileWriter(fileName,false); // "first_file.txt", true -> default değeri false'dur.
            fileWriter.write("merhaba file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        //After Java7
        try(FileWriter fileWriter1 = new FileWriter("file_writer2.txt")) {
            fileWriter1.write("java8 ile yazıyorum");
        } catch (IOException ioException) {
            System.out.println("hata meydana geldi : " + ioException.getMessage());
        }


        //After Java7
        try(FileWriter fileWriter2 = new FileWriter("buffered_writer.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter2)) {
            bufferedWriter.write("java8 ile yazıyorum");
        } catch (IOException ioException) {
            System.out.println("hata meydana geldi : " + ioException.getMessage());
        }
    }
}
