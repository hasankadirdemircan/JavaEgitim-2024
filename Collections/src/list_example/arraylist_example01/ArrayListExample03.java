package list_example.arraylist_example01;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListExample03 {

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(4);
        numberList.add(1);
        numberList.add(15);
        numberList.add(8);
        numberList.add(6);

        System.out.println(numberList);

        System.out.println("----naturalOrder sorting----");
        numberList.sort(Comparator.naturalOrder());
        System.out.println(numberList);

        System.out.println("----reverseOrder sorting----");
        numberList.sort(Comparator.reverseOrder());
        System.out.println(numberList);



        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Zehra");
        nameList.add("Ali");
        nameList.add("Abbas");
        nameList.add("Galip");

        System.out.println("----naturalOrder sorting----");
        nameList.sort(Comparator.naturalOrder());
        System.out.println(nameList);

        System.out.println("----reverseOrder sorting----");
        nameList.sort(Comparator.reverseOrder());
        System.out.println(nameList);
        System.out.println(nameList.indexOf("Abbas"));
        System.out.println(nameList.indexOf("Galip"));
        System.out.println(nameList.indexOf("sad"));
    }
}
