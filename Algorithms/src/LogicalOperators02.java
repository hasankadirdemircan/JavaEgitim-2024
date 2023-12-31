public class LogicalOperators02 {
    public static void main(String[] args) {
        int password = 123456;

        if(password == 12345) {
            System.out.println("şifreniz : 12345");
        }
        if(password == 123456) {
            System.out.println("şifreniz : 123456");
        }

        String name = "bilgeadam";
        if(name.equals("hasan")) {
            System.out.println("Merhaba Hasan!");
        }

        if(name.equals("bilgeadam")) {
            System.out.println("Merhaba bilgeadam!");
        }

        if(name == "bilgeadam") {
            System.out.println("merhaba tekrar bilgeadam!");
        }

        String name1 = "a";
        String name2 = new String( "a");//tek sebebi new olduğunda farklı bir adreste değeri tutar.-> java data memory model konusunda göreceğiz.
        if (name1 == name2) {
            System.out.println("Eşit");
        }

        if(name1.equals(name2)) {
            System.out.println("şimdi doğru yoldasın!");
        }

    }
}
