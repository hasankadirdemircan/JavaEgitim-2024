package inheritance_examples.inheritance_example04;

public class Bmw extends Car {

    private boolean isHelpDesk;

    public Bmw(String brand, int speedLimit, boolean isHelpDesk) {
        super(brand, speedLimit);
        this.isHelpDesk = isHelpDesk;
    }

    public boolean isHelpDesk() {
        return isHelpDesk;
    }

    public void setHelpDesk(boolean helpDesk) {
        isHelpDesk = helpDesk;
    }
}
