package lambda_expression.lambda_expression05;

public class LambdaTest05 {
    public static void main(String[] args) {
        LambdaFunctionV2 lambda01 =
                (int number) -> {
                    if( number % 2 == 0) return "even";
                    else return "odd";

                };
        LambdaFunctionV2 lambda02 = number -> {
            if(number % number == 0){
                return "even";
            }
            else{
                return "odd";
            }
        };

        System.out.println(lambda01.intKind(5));
        System.out.println(lambda02.intKind(5));
    }
}
