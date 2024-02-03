package inheritance_examples.inheritance_example05;

public class Computer {

    private String brand;
    private String os;

    public Computer(String brand, String os) {
        this.brand = brand;
        this.os = os;
    }

    public String getBrand() {
        return brand;
    }

    public String getOs() {
        return os;
    }
}
