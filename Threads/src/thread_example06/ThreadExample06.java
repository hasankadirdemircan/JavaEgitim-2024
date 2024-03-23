package thread_example06;

public class ThreadExample06 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Thread thread1 = new Thread(() -> {
            for(int i=0; i<5; i++) {
                bankAccount.deposit(200);
                try{
                    Thread.sleep(500); //0.5 saniye
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int i=0; i<5; i++) {
                bankAccount.withdraw(300);
                try{
                    Thread.sleep(700); //0.7 saniye
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("final balance : " + bankAccount.getBalance());
    }
}
