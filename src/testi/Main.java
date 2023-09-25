package testi;

public class Main {
    public static void main(String[] args) {

        Kasvattaja[] kasvattajat = new Kasvattaja[10];

        Säiliö säiliö = new Säiliö();

        for (int i = 0; i < kasvattajat.length; i++) {
            kasvattajat[i] = new Kasvattaja(säiliö);
        }
        for (int i = 0; i < kasvattajat.length; i++) {
            kasvattajat[i].start();
        }
        System.out.println("Säiliön laskuri: " + säiliö.getLaskuri());
    }
}
