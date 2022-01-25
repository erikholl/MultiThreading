package be.intecbrussel.exercises.exercise3;

public class PrintAppLambda {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> print('#', 100));
        Thread thread2 = new Thread(() -> print('(', 100));
        Thread thread3 = new Thread(() -> print(':', 100));
        thread1.start(); thread2.start(); thread3.start();

        System.out.println(Runtime.getRuntime().availableProcessors());
    }

    public static void print(char c, int count) {
        for(int i = 0; i < count; i++) {
            System.out.print(c);
            Thread.yield(); // .yield method establishes cooperative
            // multitasking by ensuring that each thread will get its turn -
            // this is important for computers with 1 (or limited amount of)
            // processors
        }
    }
}
