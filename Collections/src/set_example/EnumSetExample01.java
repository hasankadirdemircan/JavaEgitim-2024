package set_example;

import java.util.EnumSet;

public class EnumSetExample01 {

    public static void main(String[] args) {
       // EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);
       // EnumSet<Size> sizes = EnumSet.allOf(Size.class);
        EnumSet<Size> sizes = EnumSet.of(Size.SMALL);
        sizes.add(Size.SMALL);
        sizes.add(Size.SMALL);
        System.out.println(sizes);

        EnumSet<Size> sizes2 = EnumSet.allOf(Size.class);
        sizes2.add(Size.A);
        sizes2.add(Size.A);
        sizes2.add(Size.EXTRALARGE);
        sizes2.add(Size.EXTRALARGE);
       // sizes2.add("EXTRALARGE");
        System.out.println(sizes2);


        // Creating an EnumSet using noneOf()
        EnumSet<Size> sizes3 = EnumSet.noneOf(Size.class);
        System.out.println(sizes3);
        sizes3.add(Size.MEDIUM);
        System.out.println(sizes3);

    }
}
