import java.util.Objects;

public class UnCheckedExceptionExample02 {
    public static void main(String[] args) {
        String name = null;
        //kotu yaklasim.
     /*   try {
            if(name.equals("kadir")) {
                System.out.println("name : kadir");
            }
        }catch(NullPointerException e) {
            System.out.println("catch!");
        }*/

       /* if(Objects.nonNull(name) && name.equals("kadir")) {
            System.out.println("hoşgeldin");
        }*/

        //en iyi yaklaşım
        if("kadir".equals(name)) {
            System.out.println("hoşgeldin");
        }
      //  name.equals() // null olan bir değer için equals fonksiyonunu çalıştırıyorum
   //"kadir".equals(null) // kadir.equals kadir üzerinde bir fonksiyon çalıştırabilir çünkü kadir null değil.
        //özet: null olan herhangi bir şeye .(nokta) koyup fonksiyon çağırırsak nullpointerexception alırız.

        System.out.println("uygulama kapanıyor");

    }
}
