package functional_interface.functional_interface06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalInterface06 {
    public static void main(String[] args) {
        String inputText = "Merhaba Dünya";

      //  StringTransformer test = input -> inputText = inputText.toUpperCase();

        StringTransformer toUpperCaseTransformer = input -> input.toUpperCase();
        String transformedText = toUpperCaseTransformer.transform(inputText);

        System.out.println("Original text :" + inputText);
        System.out.println("Transformed text : " + transformedText);

    }
}
