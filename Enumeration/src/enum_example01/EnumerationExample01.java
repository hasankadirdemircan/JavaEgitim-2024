package enum_example01;

import java.util.Arrays;

public class EnumerationExample01 {
    public static void main(String[] args) {
        EnumerationExample01 enumerationExample01 = new EnumerationExample01();
        enumerationExample01.orderCoffee(CoffeeSizeEnum.MEDIUM);
        System.out.println(CoffeeSizeEnum.MEDIUM.ordinal());
        System.out.println(CoffeeSizeEnum.EXTRALARGE.ordinal());
        System.out.println(CoffeeSizeEnum.SMALL.compareTo(CoffeeSizeEnum.MEDIUM));
        System.out.println(CoffeeSizeEnum.MEDIUM.compareTo(CoffeeSizeEnum.SMALL));
        System.out.println(CoffeeSizeEnum.EXTRALARGE.compareTo(CoffeeSizeEnum.SMALL));
        System.out.println(CoffeeSizeEnum.EXTRALARGE);
        System.out.println(CoffeeSizeEnum.EXTRALARGE.name());
        System.out.println(CoffeeSizeEnum.valueOf("LARGE"));
        System.out.println("---------");
        Arrays.stream(CoffeeSizeEnum.values()).toList().forEach(System.out::println);
        System.out.println("---------");
        for(CoffeeSizeEnum coffeeSizeEnum : CoffeeSizeEnum.values()) {
            System.out.println(coffeeSizeEnum);
        }
    }

    public void orderCoffee(CoffeeSizeEnum coffeeSize) {
        switch (coffeeSize) {
            case SMALL ->
                System.out.println("I ordered a SMALL size coffee");
            case MEDIUM ->
                System.out.println("I ordered a MEDIUM size coffee");
            case LARGE ->
                System.out.println("I ordered a LARGE size coffee");
            case EXTRALARGE ->
                System.out.println("I ordered a EXTRALARGE size coffee");
        }
    }
}