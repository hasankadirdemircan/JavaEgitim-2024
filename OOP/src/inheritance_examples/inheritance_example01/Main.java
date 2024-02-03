package inheritance_examples.inheritance_example01;

public class Main {
    public static void main(String[] args) {
        Dog kirli = new Dog();
        kirli.setSurungen(false);
        kirli.run();
        kirli.setName("kirli");
        System.out.println("benim adim : " + kirli.getName());
        System.out.println("kirli isSurungen : " + kirli.isSurungen());
        kirli.eat();
        kirli.see();

        Cat pisi = new Cat();
        pisi.setSurungen(false);
        pisi.setName("pisi");
        pisi.jump();
        System.out.println(pisi.getName());
        System.out.println("pisi isSurungen : " + pisi.isSurungen());
        pisi.eat();
        pisi.see();

        Snake snake = new Snake();
        snake.setSurungen(true);
        snake.eat();
        System.out.println("snake isSurungen : " + snake.isSurungen());
        snake.see();

        Bat bat = new Bat();
        bat.see();
    }
}
