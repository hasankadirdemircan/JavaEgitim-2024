import java.util.Random;

public class Main {

    public static void main(String[] args) {

       int[] numbers = {1,2,3,4,5,6};
       int toplam = 0;
       for(int i=0; i<numbers.length; i++){
           numbers[i] = numbers[i] * 2;
           toplam = toplam + numbers[i];
       }


       for(int number : numbers){
           toplam = toplam + number;
       }
        System.out.println(toplam);
    }
}



