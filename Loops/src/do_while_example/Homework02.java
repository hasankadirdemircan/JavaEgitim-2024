package do_while_example;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        int sayi;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("Sıfırdan farklı bir sayı giriniz.");
            sayi= scanner.nextInt();
            System.out.println("girilen sayi : " + sayi);
        }while (sayi == 0);
    }
}
