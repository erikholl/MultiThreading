package be.intecbrussel.lesdemo;

public class CharacterRunnable implements Runnable {
    private int amount;
    private String textToPrint;

    public CharacterRunnable(int amount, String textToPrint) {
        this.amount = amount;
        this.textToPrint = textToPrint;
    }


    @Override
    public void run() {
        for (int i = 0; i < amount; i++) {
            System.out.println(i + " - " + textToPrint);
        }

    }
}
