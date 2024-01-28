package constructor_examples.constructor_example02;

public class ConstructorExample02 {

    int age;
    ConstructorExample02() {
        this.age = 55;
    }

    public static void main(String[] args) {
        ConstructorExample02 constructorExample02 = new ConstructorExample02();
        System.out.println(constructorExample02.age);
        constructorExample02.sayHello();
    }


    public void sayHello() {
        System.out.println("hello");
    }
}
