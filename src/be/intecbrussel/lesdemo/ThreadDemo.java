package be.intecbrussel.lesdemo;

public class ThreadDemo {
    public static void main(String[] args) {

        CharacterThread potatoThread = new CharacterThread(100, "potato"); //
        // thread in state 'new'
        CharacterThread sushiThread = new CharacterThread(100, "sushi");

        CharacterRunnable characterRunnable = new CharacterRunnable(100,
                                                                    "shoe");
        Thread shoeThread = new Thread(characterRunnable);
        /*
        another way of creating a thread with a Runnable (which is a functional
        interface - remember, interface with 1 method - which means we can
        use lambda expressions). Difference between implementing Runnable
        and extending Thread: extending Thread means inheritance, but you
        cannot use inheritance outside the inherited Thread - because it
        is not possible to inherit from multiple classes
        */

        Thread lambdaThread = new Thread(() -> print(100, "lambda"));
        System.out.println(sushiThread.getState());

        potatoThread.start();
        sushiThread.start();
        shoeThread.start();
        lambdaThread.start();
        /*
        .start() puts the thread in state 'ready'. when a thread is in 'ready'
        state, it needs to (and will) be picked up by the Scheduler of the OS
        to go into 'running' state. after that, when the thread is completed,
        it gets 'terminated' state. a thread has a .isAlive() method. this
        method will return false for states 'new' and 'terminated'; true for
        states 'ready' and 'running'.
        'runnable' state is the combination of 'ready' and 'running': it
        means the thread is active
         */

        System.out.println(sushiThread.getState());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(sushiThread.getState());
        sushiThread.start();
//        for(int i = 0; i < 100; i++) {
//            System.out.println(i + " - " + "carrot");
//        }

//        System.out.println("This is line1");
//        System.out.println("This is line2");
//        System.out.println("This is line3");

        /*
        important in multithreading: threads that use the same pool of
        resources; think McDonalds with limited stock of chicken menus ->
        multiple threads ordering chicken menus could lead to exceptions.
         */
    }

    private static void print(int amount, String textToPrint) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " - " + textToPrint);
        }
    }
}
