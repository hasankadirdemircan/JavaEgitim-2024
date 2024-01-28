package class_examples.class_example03;

public class Main {
    public static void main(String[] args) {
        Account yaren = new Account();
        yaren.budget = 5000;
        yaren.id = 1L;
        yaren.gender = "female";
        yaren.name = "yaren";
        yaren.password = "123456";

        Account galip = new Account();
        galip.budget = 2000;
        galip.id = 2L;
        galip.gender = "male";
        galip.name = "galip";
        galip.password = "423321";

        //yaren
        yaren.withdraw(300);
        System.out.println("yaren'in kalan parası :" + yaren.budget);
        yaren.withdraw(250);
        System.out.println("yaren'in kalan parası :" + yaren.budget);
        yaren.deposit(5);
        System.out.println("yaren'in kalan parası :" + yaren.budget);

        //galip
        galip.deposit(2100);
        System.out.println("galip'in kalan parası :" + galip.budget);
        galip.withdraw(5000);
        System.out.println("galip'in kalan parası :" + galip.budget);


    }
}
