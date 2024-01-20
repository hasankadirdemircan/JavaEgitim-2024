import java.util.Objects;

public class UnCheckedExceptionExample01 {
    public static void main(String[] args) {
        String name = null;
        String name2 = "java";
        if(Objects.nonNull(name)) {
            name.toUpperCase();
        }

        System.out.println("diğer kodlar");
        System.out.println("uygulama kapanıyor.");
    }
}
