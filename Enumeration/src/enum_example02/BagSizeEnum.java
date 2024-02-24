package enum_example02;

public enum BagSizeEnum {
    SHORT(15), MEDIUM(20), BIG(25);

    private int price;

    BagSizeEnum(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
