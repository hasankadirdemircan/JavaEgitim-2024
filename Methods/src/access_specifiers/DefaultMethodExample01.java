package access_specifiers;

public class DefaultMethodExample01 {
    public static void main(String[] args) {
        DefaultMethodExample01 defaultMethodExample01 = new DefaultMethodExample01();
        System.out.println(defaultMethodExample01.topla(6,8));
    }

    int topla(int number1, int number2) {
        return number1 + number2;
    }
}
