package generics_example07;

public class GenericsVarargsExample {

    public static <T> void printArray(T... items) { //T item1, T item2, T item3 ...
        for(T item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void withdraw(String cardNo, Double price) {

    }
    public static void main(String[] args) {
        System.out.println("String dizisi");
        printArray("merhaba", "dünya", "java");
        printArray("merhaba", "dünya");
        printArray("merhaba");

        System.out.println("Integer dizisi");
        printArray(1,2,3,4,5);
        printArray(1,2,3,5);
        printArray(1,3,5);

        System.out.println("Double dizisi");
        printArray(3.14, 5.123, 2.15);
        printArray(3.14, 2.15);
    }
}
