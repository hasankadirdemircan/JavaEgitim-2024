package inheritance_examples.inheritance_example07;

import inheritance_examples.inheritance_example06.Animal;

public class Dog extends Animal{

    public Dog(String name) {
        this.name = name; //Eğer Animal classının bulunduğundan farklı bir package içerisindeysem ->  Animal class'ı içerisindeki name field'ı protected olduğu için sadece extends edilen classtan ulaşabilirim.
    }

    public void getInfo() {
        System.out.println("My name is : " + name);
    }
    public void displaySomething() {
        super.display();//Eğer Animal classının bulunduğundan farklı bir package içerisindeysem -> Animal class'ı içerisindeki display methodu protected olduğu için sadece extends edilen classtan ulaşabilirim.
    }
}
