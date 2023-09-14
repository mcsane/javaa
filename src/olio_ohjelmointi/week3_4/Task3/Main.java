package olio_ohjelmointi.week3_4.Task3;

import java.io.*;


public class Main {
    public static void main(String[] args) {

        Student student = new Student(1, "jake", 20);
        Course course = new Course("CS101", "IJava", "Smith");
        Enrollment enrollment = new Enrollment(student, course, "2023-09-14");


        try (FileOutputStream fileOut = new FileOutputStream("enrollments.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(enrollment);
            System.out.println("Enrollment serialized and saved to enrollments.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileInputStream fileIn = new FileInputStream("enrollments.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Enrollment savedEnrollment = (Enrollment) in.readObject();
            System.out.println("Deserialized Enrollment:");
            System.out.println(savedEnrollment);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}