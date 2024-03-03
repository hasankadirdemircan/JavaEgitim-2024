package set_example;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetExample04 {
    public static void main(String[] args) {
        // Creating an EnumSet using allOf()
        EnumSet<Size> sizes = EnumSet.allOf(Size.class);

        Iterator<Size> iterate = sizes.iterator();

        System.out.print("EnumSet: ");
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        System.out.println();
        System.out.println("foreach");
        for(Size value: sizes) {
            System.out.println(value);
        }

    }
}
