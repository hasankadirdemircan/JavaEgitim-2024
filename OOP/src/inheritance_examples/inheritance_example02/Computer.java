package inheritance_examples.inheritance_example02;

public class Computer {

    private int ram;
    private double weight;
    private double height;
    private double price;

    private boolean hasTypeC;

    private boolean isDesktop;

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasTypeC() {
        return hasTypeC;
    }

    public void setHasTypeC(boolean hasTypeC) {
        this.hasTypeC = hasTypeC;
    }
}
