import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        boolean t = false;
        System.out.println("Before the return.");
        Scanner scanner = new Scanner(System.in);

        if (t) {
            //işlem yapma aşağıdaki hiç bişeyi yapma
        }else {
            System.out.println("This won't execute.");
        }

        /*
        üstteki uzun if else yerine ben böyle yazıyorum.  daha şık daha okunaklı
        if (t)
			return;

         */
    }
}
