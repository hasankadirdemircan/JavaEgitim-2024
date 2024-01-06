public class NestedIfExample01 {
    public static void main(String[] args) {

        String gender = "F";
        int age = 28;

        if(gender.equals("M") ) {
            if(age > 18) {
                System.out.println("are you read to be a soldier!!");
            }else {
                System.out.println("wait a bit");
            }
        }else {
            System.out.println("you don't need to be soldier! because you are female!");
        }
    }
}
