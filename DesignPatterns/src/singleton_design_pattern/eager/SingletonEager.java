package singleton_design_pattern.eager;

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {

    }

    public static SingletonEager getInstance() {
       return instance;
    }

    public void printHello(String name) {
        System.out.println("hello " + name);
    }
}
