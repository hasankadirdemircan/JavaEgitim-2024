package singleton_design_pattern.thread_safe;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            SingletonThreadSafe singleton = SingletonThreadSafe.getInstance();
            System.out.println("thread1 singleton instance created");
        });
        Thread thread2 = new Thread(() -> {
            SingletonThreadSafe singleton = SingletonThreadSafe.getInstance();
            System.out.println("thread2 singleton instance created");
        });

        thread1.start();
        thread2.start();
    }
}
