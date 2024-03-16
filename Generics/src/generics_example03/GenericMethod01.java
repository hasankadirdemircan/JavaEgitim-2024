package generics_example03;

public class GenericMethod01 {

    public static <T> void printArray(T[] array) {
        for(T element : array) {
            System.out.println(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 3, 5, 73, 81};
        Double[] doubleArray = {1.1, 3.3, 5.5, 73.1, 81.9};
        String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};

        System.out.println("Integer array");
        printArray(intArray);

        System.out.println("Double array");
        printArray(doubleArray);

        System.out.println("String array");
        printArray(stringArray);
    }
}
