package testi;

import java.util.Random;

public class Noppa extends Thread{

    private long silmäLukujenSumma;
    private long heittojenLkm;
    private Random random = new Random();
    public Noppa(long heittojenLkm){
        this.heittojenLkm = heittojenLkm;
    }
    public void run(){
        for (int i = 0; i < this.heittojenLkm; i++) {
            this.silmäLukujenSumma += random.nextInt(6)+1;
        }
    }
    public long getSilmäLukujenSummasilmälukujenSumma(){
        return this.silmäLukujenSumma;
    }
    public static void main(String[] args) {

        java.util.Scanner lukija = new java.util.Scanner(System.in);

        System.out.println("Anna heittojen lukumäärä: ");
        long heittojaYhteensä = Long.parseLong(lukija.nextLine());

        System.out.println("Anna säikeiden lukumäärä");
        int säikeidenLkm = Integer.parseInt(lukija.nextLine());

        Noppa[] nopat = new Noppa[säikeidenLkm];
        for (int i = 0; i < nopat.length; i++) {
            nopat[i] = new Noppa((long)heittojaYhteensä/säikeidenLkm);
            nopat[i].start();
        }

        long kaikkienSilmälukujenSumma = 0;

        for (int i = 0; i < nopat.length; i++) {
            try {
                nopat[i].join();
                kaikkienSilmälukujenSumma += nopat[i].getSilmäLukujenSummasilmälukujenSumma();
            } catch (InterruptedException ex) {
                System.out.println("Tänne ei pitäisi tulla");
            }
        }

        System.out.println("Silmälukujen summa: " + kaikkienSilmälukujenSumma);


    }
}
