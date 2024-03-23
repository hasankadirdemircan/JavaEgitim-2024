package thread_example04;

public class SumThread extends Thread {

    private int[] numbers;
    private int sum;


    public SumThread(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {

        for(int number : numbers) {
            System.out.println(number);
            sum += number;
        }
    }

    public int getSum() {
        return sum;
    }
}
