package inheritance_examples.inheritance_example05;

public class Macbook extends Computer{

    private boolean changeable;

    public Macbook(String brand, String os, boolean changeable) {
        super(brand, os);
        this.changeable = changeable;
    }

    public boolean isChangeable() {
        return changeable;
    }
}
