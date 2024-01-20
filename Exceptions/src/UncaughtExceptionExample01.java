import java.util.Objects;

public class UncaughtExceptionExample01 {
    public static void main(String[] args) {
        UncaughtExceptionExample01 uncaughtExceptionExample01 = new UncaughtExceptionExample01();
        uncaughtExceptionExample01.method1(null);
    }

    public void method1(String name) {
        System.out.println("method1");
        try {
            method2(name);
        }catch (NullPointerException nullPointerException) {
            System.out.println("NullPointerException catch!");
        }
        System.out.println("method1 works");
    }

    public void method2(String name) {
        System.out.println("method2");
        try {
            method3(name);
        }catch (NullPointerException nullPointerException) {
            System.out.println("NullPointerException catch!");
        }
        System.out.println("method2 works");
    }

    public void method3(String name) {
        System.out.println("method3");

        name.toLowerCase();
        System.out.println("method3 works");
    }
}
