import java.io.File;

public class FileProcessExample01 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.canWrite());
        System.out.println(file.canRead());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.delete());
    }
}
