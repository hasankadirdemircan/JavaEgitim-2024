package access_specifiers;

import static_methods.StaticMethodExample02;

import java.util.Random;

public class PublicAccessSpecifiersExample01 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(50); // java.util paketindeki nextInt methoduna erişebildim.

        StaticMethodExample02 staticMethodExample02 = new StaticMethodExample02();
        staticMethodExample02.topla(5, 10);
        StaticMethodExample02.cikar(10, 7);


        PrivateMethodExample01 privateMethodExample01 = new PrivateMethodExample01();
       // privateMethodExample01.topla(3,5);
        //erişemeyiz çünkü PrivateMethodExample01 class'ndaki private topla methodu
        //sadece ve sadece aynı class içerisinden erişilir.

        DefaultMethodExample01 defaultMethodExample01 = new DefaultMethodExample01();
        defaultMethodExample01.topla(4,3);

    }
}
