package class_examples.class_example01;

public class Main {

    public static void main(String[] args) {
        Dog dogOfEray = new Dog(); // class new ile oluşturulduğunda, -> heap(yığın) alanında bu bilgiler tutulur
        dogOfEray.name = "bulut";
        dogOfEray.gender = "male";
        dogOfEray.age = 1;
        dogOfEray.eyesColor = "black";

        System.out.println("Köpeğimizin adı : " + dogOfEray.name);
        System.out.println("Köpeğimizin göz rengi : " + dogOfEray.eyesColor);
        System.out.println("Köpeğimizin cinsiyeti : " + dogOfEray.gender);
        System.out.println("Köpeğimizin yaşı : " + dogOfEray.age);

        Dog dogOfGalip = new Dog();
        dogOfGalip.name = "hera";
        dogOfGalip.gender = "female";
        dogOfGalip.age = 1;
        dogOfGalip.eyesColor = "honey";

        System.out.println("Köpeğimizin adı : " + dogOfGalip.name);
        System.out.println("Köpeğimizin göz rengi : " + dogOfGalip.eyesColor);
        System.out.println("Köpeğimizin cinsiyeti : " + dogOfGalip.gender);
        System.out.println("Köpeğimizin yaşı : " + dogOfGalip.age);
        dogOfGalip.bark();
        dogOfGalip.eat();


    }
}