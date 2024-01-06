public class LogicalException02 {
    public static void main(String[] args) {
        int result1 = 5 + 4 * 3/2;
        int result2 = (5 + 4) * 3/2;
        int result3 = (5 + 4) * (3/2);
        int result4 = (5 + (4 * 3)) / 2;
        System.out.println(("\n result1: " + result1 + "\n result12: " + result2 + " \n result13: " + result3 + "\n result14: " + result4));
    }

}

