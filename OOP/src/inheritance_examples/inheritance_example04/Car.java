package inheritance_examples.inheritance_example04;

public class Car {

    private String brand;
    private int speedLimit;

    public Car(String brand, int speedLimit) {
        this.brand = brand;
        this.speedLimit = speedLimit;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }
}
