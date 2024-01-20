package protected_example;

import access_specifiers.DefaultMethodExample01;

public class ProtectedMethodExample {
    public static void main(String[] args) {
        DefaultMethodExample01 defaultMethodExample01 = new DefaultMethodExample01();
       // defaultMethodExample01.topla(4,3);
        //erişemem çünkü default methodlar sadece aynı paket içerisinde çağrılabilir.
    }

    protected int topla(int number1, int number2) {
        return number1 + number2;
    }

    public void sayHello() {
        System.out.println("hello");
    }
}
