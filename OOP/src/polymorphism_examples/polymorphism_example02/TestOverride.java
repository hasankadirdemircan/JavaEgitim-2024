package polymorphism_examples.polymorphism_example02;

class Animal {

    int size = 8;
    public void feetSize() {
        System.out.println("Animal feetSize");
    }
}

class Dog extends Animal {

    int size = 4;

    @Override
    public void feetSize() {
        System.out.println("Dog feetSize");
    }

    public void gender() {
        System.out.println("man");
    }
}
class Terrier extends Dog {

    @Override
    public void feetSize() {
        System.out.println("Terrier feetSize");
    }

    @Override
    public void gender() {
        System.out.println("female");
    }
}

public class TestOverride {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.feetSize();
        System.out.println(animal.size);
        //local variable
        //temp type Animal
        //object type Animal

        Animal dogAnimal = new Dog();
        dogAnimal.feetSize();
        System.out.println(dogAnimal.size);
        //local variable
        //temp type Animal
        //object type Dog

        //Note : the instance variable can not be override
        Dog dog = new Dog();
        dog.feetSize();
        System.out.println(dog.size);
        dog.gender();

        dog = new Terrier();
        dog.feetSize();
        System.out.println(dog.size);
        dog.gender();

    }
}