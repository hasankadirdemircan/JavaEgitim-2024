package inheritance_examples.inheritance_example04;

public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw("bmw", 500, true);

        System.out.println("brand is :" + bmw.getBrand());
        System.out.println("speed limit is :" + bmw.getSpeedLimit());
        System.out.println("is there a help desk ? :" + bmw.isHelpDesk());

    }
}
