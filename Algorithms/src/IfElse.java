public class IfElse {
    public static void main(String[] args) {
        String username = "bilgeadam";
        String password = "!bilgeAdam";

        if(username.equals("bilgeadam") && password.equals("!bilgeAdam")) {
            System.out.println("Hoş geldin bilgeadam!");
        } else {
            System.out.println("kullanıcı veya şifreniz yanlış girilmiştir.!");
        }

        if(username.equals("bilgeadam") && password.equals("!bilgeAdam")) {
            System.out.println("hoşgeldinizzzz");
        }else if(username.equals("bilgeadam")) {
            System.out.println("üzgünüm bilgeadam bişeyler ters gitti");
        }else {
            System.out.println("siz kimsiniz?");
        }
        System.out.println("işlem sonu");
    }
}
