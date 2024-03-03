import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("bilgeadam");
       // names.add(1);
        List<Integer> ages = new ArrayList<>();
        ages.add(1);
        List<Boolean> booleans = new ArrayList<>();
        booleans.add(true);
        List<Key> custom = new ArrayList<>();

        Map<String, Integer> hashmap1 = new HashMap<>();
        Map<Integer, String> hashmap2 = new HashMap<>();
        Map<String, String> hashmap3 = new HashMap<>();

        Main main = new Main();
        main.getName(new Key("a", "b", 30));
        main.getName(new Model("z", "x", "w", "y"));
    }
/*
    public void getName(Key classValue) {
        System.out.println("name : "+ classValue.getName());
    }

    public void getName(Model classValue) {
        System.out.println("name : ");
    }
*/
    public <T> void getName(T classValue) {
        String name = null;
        try{
            String methodName = "getName";
            Class<?> clazz = classValue.getClass();
            Method getNameMethod = clazz.getMethod(methodName);
            name = (String) getNameMethod.invoke(classValue);
            System.out.println("name : " + name);
            //  System.out.println("name : "+ classValue);
        }catch (Exception e) {

        }
    }
}