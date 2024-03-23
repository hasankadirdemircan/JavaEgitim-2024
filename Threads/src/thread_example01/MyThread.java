package thread_example01;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}
