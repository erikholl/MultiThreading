package be.intecbrussel.exercises.exercise2;

public class PrinterAppRunnable {
    public static void main(String[] args) {

        CharacterPrinter charPrinter1 = new CharacterPrinter('e', 100);
        CharacterPrinter charPrinter2 = new CharacterPrinter('h', 100);

        Thread thread1 = new Thread(charPrinter1);
        Thread thread2 = new Thread(charPrinter2);
        thread1.start(); thread2.start();
    }
}
