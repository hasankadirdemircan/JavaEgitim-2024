package list_example.linkedlist_example01;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample01 {
    public static void main(String[] args) {
        Deque<String> animals = new LinkedList<>();

        // add element at the beginning
        animals.add("Cow");
        System.out.println("LinkedList: " + animals);

        animals.addFirst("Dog");
        System.out.println("LinkedList after addFirst(): " + animals);

        // add elements at the end
        animals.addLast("Zebra");
        System.out.println("LinkedList after addLast(): " + animals);

        // remove the first element
        animals.removeFirst();
        System.out.println("LinkedList after removeFirst(): " + animals);

        // remove the last element
        animals.removeLast();
        System.out.println("LinkedList after removeLast(): " + animals);
    }
}
