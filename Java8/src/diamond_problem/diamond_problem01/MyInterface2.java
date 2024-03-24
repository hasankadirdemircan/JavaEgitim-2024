package diamond_problem.diamond_problem01;

public interface MyInterface2 {
    public default void defaultMethod() {
        System.out.println("MyInterface2 defaultMethod");
    }
    public abstract void test();

}
