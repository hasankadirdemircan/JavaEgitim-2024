public class HandlingExceptionExample02 {
    public static void main(String[] args) {
        int number1 = 5;
        String name = "null";
        try {
            name.length();
            //System.out.println("number1 / 1 = " + (number1 / 1));
            System.out.println("başarı oldu.");
        }catch (NullPointerException nullPointerException) {
            System.out.println("catch nullPointerException! description -> " + nullPointerException.getMessage());
        }finally {
           // connection.close();
            System.out.println("her zaman çalışır");
        }

        System.out.println("uygulama kapatılıyor.");

    }
}
