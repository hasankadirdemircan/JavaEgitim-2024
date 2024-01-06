import java.util.Scanner;

public class IfStatementExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hiziniz girinz");
        double hiz = scanner.nextInt(); //75
        double ceza;
        System.out.println("hiziniz : " + hiz);
        // 75 / 2 = 37.5
        if(hiz < 50) {
            ceza = hiz * 2;
            System.out.println("cezaniz : " + ceza);
        }else if(hiz >= 50 && hiz < 70) {
            ceza = hiz / 2;
            System.out.println("cezaniz : " + ceza);
        } else if (hiz >= 70 && hiz < 85) {
            ceza = hiz;
            System.out.println("cezaniz : " + ceza);
        }else {
            ceza = hiz * 3;
            System.out.println("cezaniz : " + ceza);
        }
    }
}
