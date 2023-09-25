package week5_2.task1;
import java.util.Random;
public class TicketReservation extends Thread{
    private static int tickets = 10;
    private int id;
    private int amount;

    public TicketReservation(int id, int amount){
        this.id = id;
        this.amount = amount;
    }
    public synchronized boolean reservation(){
        if (amount <= tickets){
            tickets -= amount;
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public void run(){
        boolean check = reservation();
        if (check){
            System.out.println("Customer " + id + " reserved "+ amount + " ticekts");
        }
        else {
            System.out.println("Customer " + id + " couldn't reserve "+ amount + " ticekts");
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 1; i <= 15; i++){
            int tickets = random.nextInt(3)+1;
            new TicketReservation(i, tickets).start();
        }
    }


}
