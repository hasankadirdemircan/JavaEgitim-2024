package function_examples;

import java.util.function.Function;

public class FunctionExample07 {
    public static void main(String[] args) {
        Function<String, String> extractNumbers = text -> {
            StringBuilder numbers = new StringBuilder();
            for(char c : text.toCharArray()) {
                if(Character.isDigit(c)) {
                    numbers.append(c);
                }
            }
            return numbers.toString();
        };

        String sentence = " I have 3 apples and 5 oranges";
        String extractedNumbers = extractNumbers.apply(sentence);
        System.out.println("extracted numbers : " + extractedNumbers);
    }
}
