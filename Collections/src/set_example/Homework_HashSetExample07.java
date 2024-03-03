package set_example;

import java.util.HashSet;

public class Homework_HashSetExample07 {

    //HOMEWORK - burada farklar kalsın yani yeni Set 1 ve 2 değeri ile oluşsun.
    public static void main(String[] args) {
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("HashSet2: " + oddNumbers);

        // Difference between HashSet1 and HashSet2
        oddNumbers.addAll(primeNumbers);
        oddNumbers.removeAll(primeNumbers);
        System.out.println("Difference : " + primeNumbers);

    }
}
