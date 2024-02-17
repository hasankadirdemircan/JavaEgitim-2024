import java.util.Arrays;

public class PickingNumbers {
    public static void main(String[] args) {
        int [] array = {5,1,1,4,2,2,4,5,5};
        //int [] array = {1,2,2,3,1,2};
       // int [] array = {4,6,5,3,3,1};

        Arrays.sort(array);
        int count = 0;
        int max = 0;
        for(int i=0; i< array.length; i++) {
            for( int j=i; j< array.length; j++) {
                if(Math.abs(array[i] - array[j]) <=1) {
                    count++;
                }else {
                    break; // sıralı olduğu için sona kadar kontrol etmesine gerek yok.
                }
            }
            if(count >max) {
                max = count;
            }
            count = 0;
        }

        System.out.println("max : " + (max));
    }
}
