package stream_examples.terminal_examples;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TerminalExample08 {
    public static void main(String[] args) {
        String frenchCounting = "en:deux:trois:quatre";
        List<String> list1 = Pattern.compile(":").splitAsStream(frenchCounting).collect(Collectors.toList()); //Java16+ toList()
        System.out.println(list1);

        Set<String> list2 = Pattern.compile(":")
                .splitAsStream(frenchCounting)
                .collect(Collectors.toSet());


        Map<String, Integer> nameLength = List.of("Arnold", "Alois", "Schwarzenegger").stream()
                .collect(Collectors.toMap(name -> name, String::length));
        System.out.println(nameLength);
    }
}
