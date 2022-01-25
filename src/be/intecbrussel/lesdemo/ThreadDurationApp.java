package be.intecbrussel.lesdemo;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ThreadDurationApp {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for(int i = 0; i < 1000000; i++)
            System.out.println("hello");
        });

        LocalTime beforeRunning;
        LocalTime afterRunning;

        beforeRunning = LocalTime.now();
        thread.start();

        while (thread.getState() != Thread.State.TERMINATED) {
        }
        afterRunning = LocalTime.now();

        System.out.println(ChronoUnit.MILLIS.between(beforeRunning,
                                                     afterRunning) + " " +
                                   "milliseconds");

        // emrah's solution
//        double start = System.nanoTime(); // put at right place
//        double finish = System.nanoTime(); // put at right place
//        double timeElapsed = finish - start;
//        System.out.println(timeElapsed/1000000000);
    }
}
