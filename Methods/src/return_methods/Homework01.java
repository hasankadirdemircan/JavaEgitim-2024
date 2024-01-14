package return_methods;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("1. sayıyı  girin");
        int num1= scanner.nextInt();
        System.out.println("2. sayıyı girin");
        int num2= scanner.nextInt();
        System.out.println("büyük olan sayı"+ (10+sum(num1,num2)));

    }
    public static int sum(int num1, int num2){
        if(num1>num2){
            return num1;
        } else if (num1<num2) {
            return num2;

        }
        return num1;
    }
}
