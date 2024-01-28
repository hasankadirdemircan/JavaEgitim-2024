package class_examples.class_example03;

public class Account {

    long id;
    double budget;
    String name;
    String password;
    String gender;


    public void withdraw(int cash) {
        if(budget >= cash) {
            budget = budget - cash;
            System.out.println("ilk önce kartınızı daha sonrasında paranızı alandan alınız.");
        }else {
            throw new RuntimeException("hesapta istenilen cash yok..");
        }
    }

    public void deposit(int cash) {
        budget = budget + cash;
      //  budget += cash;
    }
}
