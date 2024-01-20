import java.util.Scanner;

/**
 * Hero is the main entity we'll be using to . . .
 *
 * Please see the {@link java_doc.JavaDoc} class for true identity
 * @author Captain America
 *
 */
public class Main {

    /**
     * Scanner to get user's direction
     */
    private Scanner scanner = new Scanner(System.in);

    
    /**
     * Returns the floor modulus of the {@code long} and {@code int} arguments.
     * <p>
     * The floor modulus is {@code x - (floorDiv(x, y) * y)},
     * has the same sign as the divisor {@code y}, and
     * is in the range of {@code -abs(y) < r < +abs(y)}.
     *
     * <p>
     * The relationship between {@code floorDiv} and {@code floorMod} is such that:
     * <ul>
     *   <li>{@code floorDiv(x, y) * y + floorMod(x, y) == x}
     * </ul>
     * <p>
     * For examples, see {@link #sayHello(String)}.
     *
     * @param args the dividend

     * @return the floor modulus {@code x - (floorDiv(x, y) * y)}
     * @throws ArithmeticException if the divisor {@code y} is zero
     * @see <a href="https://docs.oracle.com/en/java/javase/11/tools/javadoc.html#GUID-9D532574-1CDB-4D30-99F3-A308DCAEE55F"></a>
     * @since 9
     */

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main main = new Main();
        main.sayHello("hasan");
    }

    /**
     *
     * @param name -> user's name
     */
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}