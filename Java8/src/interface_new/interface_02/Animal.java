package interface_new.interface_02;

public interface Animal {

    public abstract void make();

    public default void eat() {
        System.out.println("eating...");
    }

    public default void run() {
        System.out.println("running...");
    }

    public static void breathe() {
        System.out.println("breathing...");
    }
}
