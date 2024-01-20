import java.util.Objects;

public class NullPointerExceptionExample01 {
    public static void main(String[] args) {
        String name = null;
        if(Objects.nonNull(name)) { // açık hali -> name != null
            System.out.println("İsminizin uzunluğu : " + name.length());
        }
    }
}