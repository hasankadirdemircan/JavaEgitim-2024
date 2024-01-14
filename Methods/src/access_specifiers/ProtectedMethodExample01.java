package access_specifiers;

public class ProtectedMethodExample01 {
    public static void main(String[] args) {
        ProtectedMethodExample01 protectedMethodExample01 = new ProtectedMethodExample01();
        System.out.println(protectedMethodExample01.topla(5,10));
    }

    protected int topla(int number1, int number2) {
        return number1 + number2;
    }
}
