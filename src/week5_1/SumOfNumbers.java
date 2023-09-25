package week5_1;
import java.util.Random;
public class SumOfNumbers extends Thread{
    private int n1;
    private int n2;
    private int n3;
    private int sum = 0;
    private static int totalSum = 0;
    Random rand = new Random();

    public SumOfNumbers() {
        this.n1 = rand.nextInt(10);
        this.n2 = rand.nextInt(10);
        this.n3 = rand.nextInt(10);
    }
    @Override
    public void run() {
        sum = n1 + n2 + n3;
        totalSum += sum;
    }
    public int getTotalSum() {
        return totalSum;
    }
    public int getSum() {
        return sum;
    }

    public static void main(String[] args) {
        SumOfNumbers[] numbers = new SumOfNumbers[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new SumOfNumbers();
            numbers[i].start();
        }

        for (int i = 0; i < numbers.length; i++) {
            try {
                numbers[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Thread " + (i+1) + " sum: " + numbers[i].getSum());
        }

        System.out.println("Total sum: " + numbers[0].getTotalSum());

    }

}
