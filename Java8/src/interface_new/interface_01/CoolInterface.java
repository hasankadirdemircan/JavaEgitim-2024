package interface_new.interface_01;

public interface CoolInterface {

    public abstract void make();

    public static void staticMethod() {
        System.out.println("static method");
    //    staticMethod2();
    }
    private static void staticMethod2() {
        System.out.println("private static method");
    }
}
