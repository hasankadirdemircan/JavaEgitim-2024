package state_design_pattern;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        System.out.println("Lambanın başlangıç durumu : " + context.getLampState().getClass().getName());
        System.out.println();
        context.onClose();
        context.onOpen();
        System.out.println("*******************************");

        System.out.println("Lambanın şuan durumu : " + context.getLampState().getClass().getName());
    }
}
