package singleton_design_pattern.lazy;

public class SingletonExample {

    private static SingletonExample instance;

    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        if(instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    public void printHello(String name) {
        System.out.println("hello " + name);
    }
}
