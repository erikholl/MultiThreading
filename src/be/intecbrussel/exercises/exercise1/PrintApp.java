package be.intecbrussel.exercises.exercise1;

public class PrintApp {
    public static void main(String[] args) {
        PrintThread printThread1 = new PrintThread('*', 100);
        PrintThread printThread2 = new PrintThread('$', 100);
        // note: char is provided with single quotes
        printThread1.start();
        printThread2.start();

    }
}
