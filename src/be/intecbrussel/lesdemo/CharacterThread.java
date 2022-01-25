package be.intecbrussel.lesdemo;

public class CharacterThread extends Thread {
    private int amount;
    private String textToPrint;

    public CharacterThread(int amount, String textToPrint) {
        this.amount = amount;
        this.textToPrint = textToPrint;
    }

    // override of the run method is required in a Thread
    @Override
    public void run() {
        for (int i = 0; i < amount; i++) {
            System.out.println(i + " - " + textToPrint);
        }
    }
}
