package be.intecbrussel.lesdemo;

public class NumberCounter {
    private static int counter; // default value = 0
    private Object monitorObject = new Object();

    public void increment() {
        synchronized (monitorObject) {
            counter++;
        }
    }

    public synchronized void decrement() {
            counter--;
    }

    /*
    difference between having a synchronized declared IN a method and a
    method declared AS synchronized: IN a method means that a part of the
    method can be synchronized. AS a method means the whole method will be
    synchronized.
     */

    @Override
    public String toString() {
        return "counter is at: " + counter;
    }
}
