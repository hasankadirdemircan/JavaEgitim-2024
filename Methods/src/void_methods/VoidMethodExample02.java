package void_methods;

import java.util.Scanner;

public class VoidMethodExample02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adınızı giriniz: ");
        String name = scanner.nextLine();

        sayHello(name);

    }

    public static void sayHello(String isim) {
        System.out.println("Merhaba " + isim);
    }
}
