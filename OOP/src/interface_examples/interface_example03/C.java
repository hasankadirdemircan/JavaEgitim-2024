package interface_examples.interface_example03;

public class C implements A, B{
    @Override
    public void sayHi() {
        System.out.println("hi");
    }

    @Override
    public int calculateSalary() {
        return 0;
    }
}
