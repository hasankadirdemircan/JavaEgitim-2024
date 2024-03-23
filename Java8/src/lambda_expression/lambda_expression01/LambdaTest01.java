package lambda_expression.lambda_expression01;

public class LambdaTest01 {
    public static void main(String[] args) {
        LambdaFunction lambdaFunction = () -> System.out.println("hello world!");
        LambdaFunction lambdaFunction2 = () -> System.out.println("hello classs!");
        // eger Functional Interface icerisindeki abstract method parametre almiyorsa,
        // () ifadesini kullanmaliyiz.
        lambdaFunction.message();
        lambdaFunction2.message();
    }
}
