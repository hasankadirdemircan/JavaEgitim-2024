import java.util.Scanner;

public class HandlingExceptionExample01 {
    public static void main(String[] args) {
        int number1 = 5;
        String name = null;
        try {
            name.length();
            //System.out.println("number1 / 1 = " + (number1 / 1));
            System.out.println("başarı oldu.");
        }catch (ArithmeticException arithmeticException) {
            System.out.println("catch arithmeticException! description -> " + arithmeticException.getMessage());
        }catch (NullPointerException nullPointerException) {
            System.out.println("catch nullPointerException! description -> " + nullPointerException.getMessage());
        }catch (Exception exception) {
            System.out.println("catch exception! description -> " + exception.getMessage());
        }
        System.out.println("uygulama kapatılıyor.");

    }
}
