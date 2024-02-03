package inheritance_examples.inheritance_example01;

public class Cat extends Animal{

    public void jump() {
        System.out.println("Cat is jumping");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("I'm a cat, I love chicken");
    }
}
