import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample01 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = null;
        String kullanici = "";

        String fileName = "first_file.txt";
        try {
            fileWriter = new FileWriter(fileName,false); // "first_file.txt", true -> default değeri false'dur.
            fileWriter.write("merhaba file");
            fileWriter.write("abc  ");
            fileWriter.write(System.lineSeparator());
            fileWriter.write("nextlinee");
            fileWriter.write("\n");
            fileWriter.write("hohoho");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            fileWriter.close();
        }

        FileReader fileReader = null;
        int i;
        try{
            fileReader = new FileReader(fileName);
            while ((i=fileReader.read()) != -1) {
                System.out.print((char)i);
            }
        }catch (FileNotFoundException fileNotFoundException) {
            throw new RuntimeException(fileNotFoundException);
        }finally {
            fileReader.close();
        }
    }
}