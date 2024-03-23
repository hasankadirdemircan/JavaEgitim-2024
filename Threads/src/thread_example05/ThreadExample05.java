package thread_example05;

public class ThreadExample05 {

    public static void main(String[] args) {
        Runnable task1 = () -> {
            for(int i=1; i<=5; i++) {
                System.out.println("Thead 1 - Count : " + i);
               /* try{
                    Thread.sleep(1000);//1 saniye bekle
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            }
        };

        Runnable task2 = () -> {
            for(int i=1; i<=5; i++) {
                System.out.println("Thead 2 - Count : " + i);
              /*  try{
                    Thread.sleep(700);//0.7 saniye bekle
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("main thread sonlandı");
    }
}
