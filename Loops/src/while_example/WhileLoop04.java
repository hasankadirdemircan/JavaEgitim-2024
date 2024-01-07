package while_example;

public class WhileLoop04 {

    public static void main(String[] args) {
        int start = 0;
        boolean devamEt = true;
        while(devamEt) {
            System.out.println("start değişkenim : " + start);
            start++;
            if(start > 5) {
                devamEt = false;
            }
        }
        System.out.println("program kapatılıyor.");
    }
}
