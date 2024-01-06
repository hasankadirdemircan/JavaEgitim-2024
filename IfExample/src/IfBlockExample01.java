public class IfBlockExample01 {
    public static void main(String[] args) {
        int i = 20;

        if (i < 15)
            System.out.println("Inside If block"); // part of if block(immediate one statement after if condition)
            System.out.println( i + " is less than 15"); //always executes as it is outside of if block


        // This statement will be executed
        // as if considers one statement by default again below statement is outside of if block
        System.out.println("I am Not in if");

    }
}
