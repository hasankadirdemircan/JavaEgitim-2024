package singleton_design_pattern.lazy;
/*
Singleton design pattern, farklı classlardan bir class kullanıldığında hep aynı instance
üzerindne erişim yapılması ve bu sayede bellekte boştan yere aynı intance'dan üretilmemesi için
bu pattern kullanılmıştır.
 */
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
