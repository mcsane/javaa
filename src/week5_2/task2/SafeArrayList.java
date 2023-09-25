package week5_2.task2;

import java.util.ArrayList;

public class SafeArrayList extends Thread{
    private ArrayList<String> list = new ArrayList<>();

    public synchronized void add(String string){
        list.add(string);
    }
    public synchronized void remove(String string){
        list.remove(string);
    }
    public synchronized int size(){
        return list.size();
    }

    public static void main(String[] args) {
        SafeArrayList safeArrayList = new SafeArrayList();

        Thread thread1 = new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 1000; i++){
                    safeArrayList.add("Thread 1" + i);
                }
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 500; i++){
                    safeArrayList.remove("Thread 1" + i);
                }
            }
        };
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(safeArrayList.size());
    }
}
