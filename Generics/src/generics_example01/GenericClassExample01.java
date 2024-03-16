package generics_example01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GenericClassExample01 {

    public static void main(String[] args) {
        GenericClass<Integer> intObj = new GenericClass<>(5); //generic
     //   List<Integer>  -> generic

        intObj.getData();

        GenericClass<String> stringObj = new GenericClass<>("hello");
        stringObj.getData();
    }
}
