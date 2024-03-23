package lambda_expression.lambda_expression03;

public class LambdaExample03 {
    public static void main(String[] args) {
        LambdaFunctionWithMoreParameters lambda01 = (number1, number2) -> System.out.println("plus is : " + number1 + number2);
        LambdaFunctionWithMoreParameters lambda02 = (int number1, int number2) -> System.out.println("plus is : " + number1 + number2);
      //  LambdaFunctionWithMoreParameters lambda02 = int number1, int number2 -> System.out.println("plus is : " + number1 + number2);
        //LambdaFunctionWithMoreParameters lambda03 = (int number1,  number2) -> System.out.println("plus is : " + number1 + number2);

        LambdaFunctionWithMoreParameters lambda03 = (int number1, int number2) -> {
            System.out.println("calculation");
            System.out.println("plus is : " + number1 + number2);
        };

        lambda01.plus(3,5);
        lambda02.plus(3,5);
        lambda03.plus(3,5);
    }
}
