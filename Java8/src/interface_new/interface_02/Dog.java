package interface_new.interface_02;

public class Dog implements Animal{
    @Override
    public void make() {
        System.out.println("dog is making");
    }

    @Override
    public void run() {
        System.out.println("dog is running...");
    }
}
