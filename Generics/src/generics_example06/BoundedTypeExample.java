package generics_example06;

public class BoundedTypeExample {

    public static <T extends Number> void findMinMax(T[] array) {
        if(array == null || array.length == 0) {
            return;
        }
        T min = array[0];
        T max = array[0];
        for(T element : array) {
            if(element.doubleValue() < min.doubleValue()) {
                min = element;
            }

            if(element.doubleValue() > max.doubleValue()) {
                max = element;
            }
        }

        System.out.println("Min : " + min);
        System.out.println("Max : " + max);

    }
    public static void main(String[] args) {
        Integer[] intArray = {2, 7, 1, 9, 5};
        Double[] doubleArray = {3.5, 7.2, 1.8, 9.9, 5.1};

        System.out.println("integer min max");
        findMinMax(intArray);

        System.out.println("double min max");
        findMinMax(doubleArray);

        Integer[] emptyIntArray = {};
        findMinMax(emptyIntArray);

        String[] stringArray = {"merhaba", "hello", "hola"};
   //     findMinMax(stringArray); ERROR
    }
}
