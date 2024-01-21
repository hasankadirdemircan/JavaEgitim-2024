import java.io.File;
import java.io.IOException;

public class FileProcessExample04 {
    public static void main(String[] args) throws IOException {
        File directory = new File("myDir");
        boolean isCreatedDirectory = directory.mkdir();
        System.out.println("isCreatedDirectory :" + isCreatedDirectory);

        File childDirectory = new File(directory, "file");
        boolean isCreatedChildDirectory = childDirectory.mkdir();
        System.out.println("isCreatedChildDirectory : " + isCreatedChildDirectory);


        File file = new File(directory, "test.txt");
        boolean isCreatedChildFile = file.createNewFile();
        System.out.println("isCreatedChildFile : " + isCreatedChildFile);

        File file2 = new File(childDirectory, "test2.txt");
        boolean isCreatedChildFile2 = file2.createNewFile();
        System.out.println("isCreatedChildFile2 : " + isCreatedChildFile2);
    }
}
