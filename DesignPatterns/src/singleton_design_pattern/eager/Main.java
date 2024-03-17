package singleton_design_pattern.eager;

public class Main {
    public static void main(String[] args) {
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();
        SingletonEager singletonEager3 = SingletonEager.getInstance();
        singletonEager1.printHello("bilgeadam");
    }
}
