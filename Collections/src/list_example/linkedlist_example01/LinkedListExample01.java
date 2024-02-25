package list_example.linkedlist_example01;

import java.util.LinkedList;

public class LinkedListExample01 {

    public static void main(String[] args) {
        LinkedList<String> animalList = new LinkedList<>();
        animalList.add("Dog");
        animalList.add("Cat");
        animalList.add("Cow");
        animalList.add("Bird");

        System.out.println(animalList.get(0));
        System.out.println(animalList.get(2));
        System.out.println(animalList.get(3));

        animalList.remove("Bird");
        LinkedList<String> animalList2 = new LinkedList<>();
        animalList2.add("Tiger");
        animalList2.add("Monkey");
        animalList2.add("Fish");

        animalList.addAll(animalList2);
        animalList.remove("Tiger");
        System.out.println("all data of animalList : "  + animalList);
        System.out.println("isEmpty? : " + animalList.isEmpty());
        System.out.println("animalList size : " + animalList.size());

        System.out.println("----clear");
        System.out.println(animalList.getLast());
        animalList.clear();
        System.out.println("all data of animalList : " + animalList);
        System.out.println("animalList size : " + animalList.size());
        System.out.println("isEmpty? : " + animalList.isEmpty());

    }
}
