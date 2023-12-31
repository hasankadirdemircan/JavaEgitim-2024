import javax.swing.text.DateFormatter;
import java.util.Date;

public class CastingExample01 {
    public static void main(String[] args) {
        byte byteNumber = 1;
        short shortNumber = 1868;

        short newShort = byteNumber; // short newShort = (short)byteNumber
        byte newByte = (byte) shortNumber;

        //Widening Casting (automatically)
        int intNumber = 9;
        double doubleNumber = intNumber;
        System.out.println(doubleNumber);


        // Narrowing Casting (manually)
        double doubleNumber2 = 9.5;
        int newIntNumber = (int) doubleNumber2;
        System.out.println(newIntNumber);









    }
}
