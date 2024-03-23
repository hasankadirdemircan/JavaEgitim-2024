package interface_new.interface_02;

public class InterfaceFeatureTest02 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        animal.run();
        Animal.breathe();


        // Dog.run(); // legal degildir.
        // Dog.breathe(); // legal degildir.

        // interface'lerdeki static methodlari sadece,
        // interfaceAdi.staticMethodAdi seklinde cagirabiliriz.
        // bu method'lari degiskenler uzerinden cagiramiyoruz.
        // ama bunlari class yapisinda methodlara degiskenler uzerinden ulasabilecegimizi unutmayalim.

        Super.message();
        //Sub.message();
        Sub sub = new Sub();
       // sub.message();
    }
}
