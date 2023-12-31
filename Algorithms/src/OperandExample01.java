public class OperandExample01 {
    public static void main(String[] args) {
        int number1 = 87, number2 = 13;
        boolean condition = true;

       // number1 = number1 +1;
        //Ön arttırma ve azaltma operatörü (++a / --a)
        System.out.println("(number1) değeri : " + number1 + "  (++number1) değeri : " + (++number1));
        System.out.println("(number2) değeri : " + number2 + "  (--number2) değeri : " + (--number2));

        System.out.println("(number1) değeri : " + number1 + "  (number1++) değeri : " + (number1++));
        System.out.println("number1 son değer : " + number1);
        System.out.println("(number2) değeri : " + number2 + "  (number2--) değeri : " + (number2--) + " number2 tekrar : " + number2);
        System.out.println("number2 son değer : " + number2);


        System.out.println("codition : " + condition);
        System.out.println("!codition : " + !condition);
        System.out.println("last codition : " + condition);
     //   condition = !condition;
        System.out.println("reverse : " + condition);


        System.out.println("number1 value : " + number1);
        System.out.println("number2 value : " + number2);
        number1 += number2; // açık hali number1 = number1 + number2
        System.out.println("after number1 +=number2 number1 : " + number1);

        System.out.println("number1 value : " + number1);
        System.out.println("number2 value : " + number2);
        number1 -= number2; // açık hali number1 = number1 - number2
        System.out.println("after number1 -=number2 number1 : " + number1);

        System.out.println("number1 value : " + number1);
        System.out.println("number2 value : " + number2);
        number1 *= number2; // açık hali number1 = number1 * number2
        System.out.println("after number1 *=number2 number1 : " + number1);



        System.out.println("number1 value : " + number1);
        System.out.println("number2 value : " + number2);
        number1 /= number2; // açık hali number1 = number1 / number2
        System.out.println("after number1 /=number2 number1 : " + number1);
    }
}
