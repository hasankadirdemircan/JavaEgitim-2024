package thread_example03;

public class SynchronizedExample {
    private int count = 0;
    public synchronized void increment() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        SynchronizedExample synchronizedExample = new SynchronizedExample();
        Thread thread1 = new Thread(() -> {
            for(int i=0; i<1000; i++) {
                synchronizedExample.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int i=0; i<1000; i++) {
                synchronizedExample.increment();
            }
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

       System.out.println("sonuç : " + synchronizedExample.count);
    }
}
