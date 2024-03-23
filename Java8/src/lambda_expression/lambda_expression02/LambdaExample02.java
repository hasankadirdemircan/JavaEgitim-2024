package lambda_expression.lambda_expression02;

public class LambdaExample02 {
    public static void main(String[] args) {
        LambdaFunctionWithParameter lambdaFunctionWithParameter = msg -> System.out.println("your message is : " + msg);
        LambdaFunctionWithParameter lambdaFunctionWithParameter2 = (msg) -> System.out.println("your message is : " + msg);
        LambdaFunctionWithParameter lambdaFunctionWithParameter3 = (String msg) -> System.out.println("your message is : " + msg);

        lambdaFunctionWithParameter.message("hi, do you have time?");
      //  System.out.println(lambdaFunctionWithParameter3.equals("hi"));
    }
}
