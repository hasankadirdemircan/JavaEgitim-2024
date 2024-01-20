package access_specifiers;

import protected_example.ProtectedMethodExample;

public class ProtectedAccessSpecifiersExample01 {
    public static void main(String[] args) {
        ProtectedMethodExample protectedMethodExample = new ProtectedMethodExample();
        protectedMethodExample.sayHello();
        //System.out.println(protectedMethodExample.topla(5,3));
        //erişemiyorum çünkü protected olan bir method farklı bir paket altında ise
        // kullanmak için, kalıtım(extends) edilmesi gerekir -> ileride göreceğiz.


        ProtectedMethodExample01 protectedMethodExample01 = new ProtectedMethodExample01();
        System.out.println(protectedMethodExample01.topla(5,10));
        // erişebildim çünkü aynı paket içerisinde protected methoda erişebilirim.
    }
}
