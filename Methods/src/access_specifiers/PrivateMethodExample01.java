package access_specifiers;

public class PrivateMethodExample01 {
    public static void main(String[] args) {
        PrivateMethodExample01 privateMethodExample01 = new PrivateMethodExample01();
        System.out.println(privateMethodExample01.topla(5,11));
    }

    private int topla(int number1, int number2) {
        return number1 + number2;
    }
}
