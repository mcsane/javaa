package testi;

import java.util.LinkedList;
public class Task6 {
    private LinkedList<Task6> jono = new LinkedList<>();

    public Task6(){
    }
    public void lisaaJonoon(Task6 a){
        jono.add(a);
    }
    public void poistaJonosta(){
        jono.remove();
    }
    public void palvele(){
        int total = 0;
        int pituus = jono.size();
        while (!jono.isEmpty()) {
            int aika = (int) (Math.random() * (600 - 120)+120);
            total = total + aika;
            try {
                Thread.sleep(aika);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("asiakasta palveltiin " + aika + " s");
            poistaJonosta();
            if (jono.isEmpty()){
                System.out.println("keskimääräinen jonotusaika on: " + total/pituus + " s");
            }
        }

    }
    public static void main(String[] args){
        int kerrat = 0;
        Task6 palvelu = new Task6();
        while (kerrat < 5){
            palvelu.lisaaJonoon(new Task6());
            kerrat++;
        }
        palvelu.palvele();
    }
}