package testi;

public class Kasvattaja extends Thread{

    private Säiliö säiliö;

public Kasvattaja(Säiliö säiliö){
        this.säiliö = säiliö;
    }

    public void start(){
        System.out.println("Kasvattaja käynnistetty");
        for (int i = 0; i < 1000000; i++) {
            this.säiliö.kasvata();
        }
    }
}
