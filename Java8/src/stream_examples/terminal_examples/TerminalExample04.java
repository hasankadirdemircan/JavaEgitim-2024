package stream_examples.terminal_examples;

import java.util.ArrayList;
import java.util.List;

public class TerminalExample04 {
    public static void main(String[] args) {
        List.of("Monkey", "Gorilla", "Bonobo").stream().forEach(System.out::println);


        List<String> animalList = new ArrayList<>();
        List.of("Monkey", "Gorilla", "Bonobo").stream().forEach(e -> {
            if(e.length() > 6) {
                animalList.add(e + "i");
            }
        });
        System.out.println(animalList);

       List<String> animalList2 =  List.of("Monkey", "Gorilla", "Bonobo").stream()
                .filter(e -> e.length() > 6)
                .map(e -> e.concat("i"))
                .toList();

        System.out.println(animalList2);

    }
}
