package week5_1;


public class EvenNumberPrinter extends Thread{
    private int startNumber;
    private int endNumber;




    public EvenNumberPrinter(int startNumber, int endNumber) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
    }

    @Override
    public void run(){
        for (int i = startNumber; i <=endNumber;i++){
            if (i % 2 == 0){
                System.out.println("Even Thread: " + i);
            }
        }
    }
}
class OddNumberPrinter extends Thread{
    private int startNumber;
    private int endNumber;

    public OddNumberPrinter(int startNumber, int endNumber){
        this.startNumber = startNumber;
        this.endNumber = endNumber;
    }
    @Override
    public void run(){
        for (int i = startNumber; i <=endNumber;i++){
            if (i % 2 != 0){
                System.out.println("Odd Thread: " + i);
            }
        }
    }

    public static void main(String[] args) {
        int max = 400;
        int min = 1;
        new EvenNumberPrinter(min, max).start();
        new OddNumberPrinter(min, max).start();
    }
}
