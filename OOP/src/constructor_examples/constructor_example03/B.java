package constructor_examples.constructor_example03;

public class B {

    B() {
        System.out.println("Hello I'm constructor of B");
    }
    public void sayHello() {
        System.out.println("hello I'm B sayHello method");
    }

    public int sum(int number1, int number2) {
        return number1 + number2;
    }
}
