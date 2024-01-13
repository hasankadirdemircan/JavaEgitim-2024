public class ArrayExample02 {
    public static void main(String[] args) {
        //kapalı hali
        int[] numbers = {1, 2, 5, 6, 8}; // new int

        //açık hali
        int[] numbers2 = new int[5];
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 5;
        numbers2[3] = 6;
        numbers2[4] = 8;

       // numbers[3] = 25;
        System.out.println("numbers 3. index değeri : " + numbers[0]);
        System.out.println("numbers 3. index değeri : " + numbers[1]);
        System.out.println("numbers 3. index değeri : " + numbers[2]);
        System.out.println("numbers 3. index değeri : " + numbers[3]);
        System.out.println("numbers 3. index değeri : " + numbers[4]);

        for(int i=0; i<numbers.length; i++) {
            System.out.println("loop i : " + i + " değeri : " + numbers[i]);
        }

        System.out.println("foreach ile yazımı");
        for(int number : numbers ) {
            System.out.println(number);
        }
    }
}
