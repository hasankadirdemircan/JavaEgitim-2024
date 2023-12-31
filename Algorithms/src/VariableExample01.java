public class VariableExample01 {
    public static void main(String[] args) {

        //veri tipi değişken adı
        int intNumber; // int -> veri tipimiz (tam sayı)
        //intNumber -> değişkenimiz.
        long longNumber = 2132132;
        byte byteNumber = 127;
        short shortNumber = 345;

        float floatNumber = 2.3f; //ondalıklı
        double doubleNumber = 62.36d; //ondalıklı
        System.out.println();


        char charExample = 'K';
        String name = "kadir";

        int number1 = 5;
        long toplam = 5 + 3;

        boolean isHigher =  number1 > 1;
        System.out.println("isHigher : " + isHigher);
        if(isHigher) {
            System.out.println("Büyüktür.");
        }

        System.out.println("işlem bitiyor.");

        //NOT: String-Array haricindeki veri tipleri primitive tip olarak geçerler
    }
}
