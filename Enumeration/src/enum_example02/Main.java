package enum_example02;

public class Main {

    public static void main(String[] args) {
        BagSizeEnum bagSizeEnum = BagSizeEnum.BIG;
        System.out.println("Size : " + bagSizeEnum.name() + " price : " + bagSizeEnum.getPrice() + "$");
    }
}
