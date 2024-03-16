package generics_example02;

import java.util.ArrayList;
import java.util.List;

public class GenericClassExample02 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.addItem("hello");

        System.out.println("Message : " + stringBox.getItem());

        Box<Integer> integerBox = new Box<>();
        integerBox.addItem(14);
        System.out.println("Message : " + integerBox.getItem());
      /*  List<String> stringList = new ArrayList<>();
        stringList.add()*/
    }
}
