public class BoxingExample01 {
    public static void main(String[] args) {
        int number1 = 100;
        //AUTOBOXING
        Integer integer1 = number1;

        //BOXING
        Integer boxing = Integer.valueOf(100);

        //AUTOUNBOXING
        Integer number2 = 100;
        int autoUnBoxing = number2;

        //UNBOXING
        int unboxing = number2.intValue();

        //default values
        int i = 0;
        Integer integer = null;
        int[] intArray = new int[10];
        Integer[] intArray2 = new Integer[10];
        System.out.println(i);
        System.out.println(integer);
    }
}
