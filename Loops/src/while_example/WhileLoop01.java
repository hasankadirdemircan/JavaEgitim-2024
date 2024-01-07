package while_example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class WhileLoop01 {
    public static void main(String[] args) {
        int start = 0, finish = 5;

        while(finish >= start) {
            System.out.println("Start değişkenimiz : " + start + "     Finish değişkenimiz : " + finish);
            start++;
            finish--;
        }
    }
}