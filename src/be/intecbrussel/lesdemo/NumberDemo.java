package be.intecbrussel.lesdemo;

public class NumberDemo {
    public static void main(String[] args) {

        NumberCounter numberCounter = new NumberCounter();
        NumberThread numberThread = new NumberThread(numberCounter, 10000);
        NumberThread numberThread2 = new NumberThread(numberCounter, 10000);
        NumberThread numberThread3 = new NumberThread(numberCounter, 10000);

        numberThread.start();
        numberThread2.start();
        numberThread3.start();
        // above will NOT count up to 30000 - as the different threads will
        // use the counter at the same time (so thread 1 and 2 taking for
        // instance counter at 3, counting up to 4, and writing it back)

//        for(int i = 0; i < 10000; i++) {
//            numberCounter.increment();
//        }

        // puts main thread to sleep
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(numberCounter);

    }
}
