package list_example.arraylist_example01;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExample01 {
    public static void main(String[] args) {
        int[] numberArray = new int[10];
        int value = numberArray[3];
        numberArray[0] = 15;
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(5);
        ArrayList<Integer> numberList2 = new ArrayList<>();
        numberList2.add(1);
        numberList2.add(3);
        numberList2.add(5);
        numberList.addAll(numberList2);
        numberList2.get(2);
      //  numberList2.get(3);

        for(Integer number: numberList2) {
            System.out.println(number);
        }
        System.out.println("---");
      //  numberList.forEach(System.out::println); Java8
        numberList2.set(0, 15);
        ArrayList<String> stringArrayList = new ArrayList<>();
      //  stringArrayList.set
        for(Integer number: numberList2) {
            System.out.println(number);
        }
        LinkedList<String> nameList = new LinkedList<>();

    }
}