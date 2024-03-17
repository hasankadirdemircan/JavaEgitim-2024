package singleton_design_pattern.lazy;

public class Main {
    public static void main(String[] args) {
        SingletonExample singletonExample1 = SingletonExample.getInstance();
        SingletonExample singletonExample2 = SingletonExample.getInstance();
        SingletonExample singletonExample3 = SingletonExample.getInstance();
        singletonExample1.printHello("utku");
        singletonExample2.printHello("burak");
        singletonExample3.printHello("yaren");
   //     SingletonExample singletonExample4 = new SingletonExample();
      /* SingletonExample singletonExample1 = new SingletonExample();
        SingletonExample singletonExample2 = new SingletonExample();
        SingletonExample singletonExample3 = new SingletonExample();
        singletonExample1.printHello("utku");
        singletonExample2.printHello("burak");
        singletonExample3.printHello("yaren");*/
        System.out.println();
    }
}
