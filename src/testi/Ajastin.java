package testi;

public class Ajastin extends Thread{

    private double sekunnit;
    private boolean jatkuu = true;

    public Ajastin(double sekunnit){
        this.sekunnit = sekunnit;
    }

    public void run(){
        while (jatkuu) {
            try {
                Thread.sleep((long) sekunnit*1000);
                System.out.println("Tik " + sekunnit + " sekunnin kuluttua");
            } catch (InterruptedException ex) {
                System.out.println("tanne tulla");


            }
        }
    }
    public void lopeta(){
        jatkuu = false;
    }

    public static void main(String[] args) {
        Ajastin ajastin1 = new Ajastin(2);
        Ajastin ajastin2 = new Ajastin(4.3);
        ajastin1.start();
        ajastin2.start();
        System.out.println("kaikki ajastimet käynnistetty");
        java.util.Scanner lukija = new java.util.Scanner(System.in);
        lukija.nextLine();
        System.out.println("lopetetaan ajastimet");
        ajastin1.lopeta();
        ajastin2.lopeta();
        System.out.println("ajastimet lopetettu");
    }
}
