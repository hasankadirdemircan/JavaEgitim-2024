package inheritance_examples.inheritance_example05;

public class Monster extends Computer{

    private double kdv;
    public Monster(String brand, String os, double kdv) {
        super(brand, os);
        this.kdv = kdv;
    }

    public double getKdv() {
        return kdv;
    }
}
