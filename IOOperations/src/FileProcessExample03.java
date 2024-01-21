import java.io.File;
import java.io.IOException;

public class FileProcessExample03 {
    public static void main(String[] args) throws IOException {
        File directory = new File("myDir");
        boolean isCreatedDirectory = directory.mkdir();
        System.out.println("isCreatedDirectory :" + isCreatedDirectory);

        File file = new File(directory, "file.txt");
        boolean isCreatedFile = file.createNewFile();
        System.out.println("isCreatedFile : " + isCreatedFile);

        boolean isDirectoryDeleted = directory.delete();
        System.out.println("isDirectoryDelete : " + isDirectoryDeleted);

        boolean isFileDeleted = file.delete();
        System.out.println("isFileDeleted : " + isFileDeleted);

        boolean isDirectoryDeleted2 = directory.delete();
        System.out.println("isDirectoryDelete2 : " + isDirectoryDeleted2);

    }
}
