package void_methods;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("merhaba 1. sayıyı giriniz");
        int num1 = scanner.nextInt();
        System.out.println("merhaba 2. sayıyı giriniz");
        int num2 = scanner.nextInt();

         toplam(num1,num2);
         carpma(num1,num2);
         bolme(num1,num2);
         cikarma(num1,num2);
    }
    public static void toplam(int sayi1,int sayi2){
        System.out.println("toplam : " + (sayi1+sayi2));

    }
    public static void carpma(int sayi1,int sayi2){
        System.out.println("çarpma : " + (sayi1*sayi2));

    }
    public static void bolme(double sayi1,double sayi2){
        System.out.println("bölme : " + (sayi1/sayi2));

    }
    public static void cikarma(int sayi1,int sayi2){
        System.out.println("cikarma : " + (sayi1-sayi2));

    }
}
