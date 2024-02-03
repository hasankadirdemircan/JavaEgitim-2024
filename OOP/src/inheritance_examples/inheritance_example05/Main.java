package inheritance_examples.inheritance_example05;

public class Main {
    public static void main(String[] args) {
        Macbook macbook = new Macbook("mac", "macOS", true);

        System.out.println("Macbook");
        System.out.println(macbook.getBrand());
        System.out.println(macbook.getOs());
        System.out.println(macbook.isChangeable());

        Monster monster = new Monster("monster", "windows", 20);
        System.out.println("Monster");
        System.out.println(monster.getBrand());
        System.out.println(monster.getOs());
        System.out.println(monster.getKdv());
    }
}
