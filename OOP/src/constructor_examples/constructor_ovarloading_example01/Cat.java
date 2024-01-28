package constructor_examples.constructor_ovarloading_example01;

public class Cat {
    String name;
    int age;
    String color;

    Cat() {
        System.out.println("no-arg constructor");
    }

    Cat(String name) {
        System.out.println("1 String arg constructor : " + name);
    }

    Cat(int age) {

    }

    Cat(String name, String color) {

    }

    Cat(String color, String name, int age) {
        System.out.println("3 String args constructor : " + color + " , " + name + " , " + age);

    }

    Cat(String color, int age, String name) {
        System.out.println("3 String args constructor : " + color + " , " + age + " , " + name);

    }
}
