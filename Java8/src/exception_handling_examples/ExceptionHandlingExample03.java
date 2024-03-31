package exception_handling_examples;

public class ExceptionHandlingExample03 {
    public static void main(String[] args) {
        try(Computer computer = new Computer()) {
            System.out.println("try block!");
            int number = 1 / 0;
        } catch (Exception e) {
            System.out.println("catch block!");

            for(Throwable t : e.getSuppressed()) {
                System.out.println(t.getMessage());
            }
            System.out.println(e.getMessage());
        }
    }
}

class Computer implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Shut down..");
        throw  new IllegalArgumentException("Exception in close!");
    }
}
