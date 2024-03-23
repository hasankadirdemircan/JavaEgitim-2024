package thread_example06;

public class BankAccount {
    private int balance = 100;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("deposit : " + amount + " | New Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println("withdraw: " + amount + " | New Balance: " + balance);
        }else {
            System.out.println("Insufficient balance.");
        }
    }

    public int getBalance() {
        return balance;
    }
}
