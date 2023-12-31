import java.util.Locale;
import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 3;

        boolean resultAND = number1 > number2 && number1 < 0 && number2 > 0;
        System.out.println(resultAND);

        boolean resultOR = number1 > number2 || number1 < 0 || number2 > 0;
        System.out.println(resultOR);

        //int long double float -> primitive(ilkel)
       String name = "BilgEadAm".toLowerCase();
        System.out.println(name);
        System.out.println("startsWith b : "  + name.startsWith("b"));
       //Scanner scanner = new Scanner(System.in);
       int uzunluk = name.length();
        System.out.println(uzunluk);
        System.out.println("toLowerCase function : " + "B".toLowerCase(Locale.ROOT));
        System.out.println("toLowerCase function : " + "i".toUpperCase(new Locale("tr", "TR")));
        System.out.println(name.contains("a") && name.contains("B".toLowerCase(Locale.ROOT)));

        String telephoneNumber = "05320302532";
        String turkcell = "0532";
        String vodafone = "0542";
        System.out.println(telephoneNumber.startsWith(vodafone));

        if(telephoneNumber.startsWith(vodafone)) {
            System.out.println("hattınız vodafone'dur");
        }
        if(telephoneNumber.startsWith(turkcell)) {
            System.out.println("hattınız turkcell'dir");
        }



    }
}
