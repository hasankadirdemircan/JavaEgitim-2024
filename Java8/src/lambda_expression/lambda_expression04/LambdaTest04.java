package lambda_expression.lambda_expression04;

public class LambdaTest04 {
    public static void main(String[] args) {
        LambdaCalculator lambda01 = (number1, number2) -> number1 - number2;
        LambdaCalculator lambda02 = (int number1, int number2) -> number1 + number2;

        LambdaCalculator lambda03 = (number1, number2) -> {
            System.out.println("calculating : " + number1 + " * " + number2);
           return number1 * number2;
        };

        System.out.println(lambda01.process(3,5));
        System.out.println(lambda02.process(3,5));
        System.out.println(lambda03.process(3,5));
    }
}
