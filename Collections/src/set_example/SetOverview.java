package set_example;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetOverview {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(1);
        numberList.add(1);
        numberList.add(3);
        numberList.add(2);
        numberList.add(2);
        numberList.add(null);
        numberList.add(null);

        System.out.println("numberList");
        System.out.println(numberList);

        Set<Integer> numberSetList = new LinkedHashSet<>();
        // List interface aksine, set'ler yinelenen öğeler içeremez.(duplicate değer yoktur.)
        numberSetList.add(1);
        numberSetList.add(1);
        numberSetList.add(1);
        numberSetList.add(3);
        numberSetList.add(2);
        numberSetList.add(2);
        numberSetList.add(null);
        numberSetList.add(null);

        System.out.println("numberSetList");
        System.out.println(numberSetList);
    }
}
