package class_examples.class_example02;

public class Lamp {

    boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("turnOn method Lamba şuan -> " + isOn);
    }

    public void turnOff() {
        isOn = false;
        System.out.println("turnOff method lamba şuan -> " + isOn);
    }

    public void stateOfLamp() {
        System.out.println("stateOfLamp -> " + isOn);
    }
}
