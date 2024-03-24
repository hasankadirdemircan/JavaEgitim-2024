package predicate_examples;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample05 {
    public static void main(String[] args) {
        Predicate<String> nullCheckPredicate = e -> e.startsWith("a");
        Predicate<String> lengthCheckPredicate = e -> e.length() > 2;

        //predicate'leri birleştir
        Predicate<String> andPredicate = nullCheckPredicate.and(lengthCheckPredicate);

        List<String> myList = List.of("necla","yaren","asli","veli","ali","karatas", "a");
        List<String> filteredList = myList.stream().filter(andPredicate).toList();
        System.out.println(filteredList);

        String temp1 = null;
        String temp2 = "java8";
        String temp3 = "hasan";
        String temp4 = "aab";
        System.out.println(andPredicate.test(temp2));
        System.out.println(andPredicate.test(temp4));
    }
}
