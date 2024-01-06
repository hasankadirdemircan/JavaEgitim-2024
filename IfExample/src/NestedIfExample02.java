public class NestedIfExample02 {
    public static void main(String[] args) {
        String gender = "X";
        int age = 15;

        if(gender.equals("F") || gender.equals("M")) {
            if(gender.equals("F") && age > 30) {
                System.out.println("Are you read to be a soldier female!");
            } else if(gender.equals("F") && age <= 30) {
                System.out.println("wait a bit girl");
            }else if(age > 20) {
                System.out.println("are you read to be a soldier male!");
            }else {
                System.out.println("wait a bit boy");
            }
        }else {
            System.out.println("you don't need to be a soldier.");
        }
    }
}
