package inheritance_examples.inheritance_example01;

public class Dog extends Animal {

    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public void eat() {
        System.out.println("dog can eat cats");
    }
}
