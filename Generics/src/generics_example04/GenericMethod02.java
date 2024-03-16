package generics_example04;

public class GenericMethod02 {

    public static void main(String[] args) {
        DemoClass demoClass = new DemoClass();
        demoClass.<String>genericMethod("hello");
        demoClass.genericMethod("hello");

        demoClass.<Integer>genericMethod(15);
        demoClass.genericMethod(15);
    }
}
