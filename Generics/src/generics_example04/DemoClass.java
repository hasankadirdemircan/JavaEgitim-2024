package generics_example04;

public class DemoClass {

    public <T> void genericMethod(T data) {
        System.out.println("Generics Method");
        System.out.println("Data passed : " + data);
    }
}
