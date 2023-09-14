package olio_ohjelmointi.week3_4;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        int n = 100;

        List<Long> fibonacciSequence = generateFibonacci(n);

        String csvFilePath = "fibonacci.csv";


        writeFibonacciToCSV(csvFilePath, fibonacciSequence);

        System.out.println("Fibonacci sequence of " + n + " numbers has been written to " + csvFilePath);
    }


    private static List<Long> generateFibonacci(int n) {
        List<Long> fibonacciSequence = new ArrayList<>();
        long a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            fibonacciSequence.add(a);
            long temp = a;
            a = b;
            b = temp + b;
        }

        return fibonacciSequence;
    }

    private static void writeFibonacciToCSV(String filePath, List<Long> fibonacciSequence) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.append("Index,Fibonacci Number\n");
            for (int i = 0; i < fibonacciSequence.size(); i++) {
                writer.append(i + 1 + "," + fibonacciSequence.get(i) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}