package constructor_examples.constructor_ovarloading_example01;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();

        Cat cat2 = new Cat("garfield");

        Cat cat3 = new Cat("tekir", "blue",3);

        Cat cat4 = new Cat("tekir", 3, "blue");

        Cat cat5 = new Cat("tekir", "brown");
    }
}
