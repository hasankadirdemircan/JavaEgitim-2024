package functional_interface.functional_interface04;

public class FunctionalInterfaceExample04 {

    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        System.out.println("10 + 5 = " + operate(10,5, addition));
        System.out.println("10 - 5 = " + operate(10,5, subtraction));
        System.out.println("10 * 5 = " + operate(10,5, multiplication));
        System.out.println("10 / 5 = " + operate(10,5, division));
    }

    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operate(a, b);
    }
}
