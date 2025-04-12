package org.Reynard_de_Bosnie.lab2tasque2.lab2tasque2_5;

public class Tranfs implements Runnable {

    private final Doroha doroha;

    public Tranfs(Doroha doroha) {
        this.doroha = doroha;
    }

    @Override
    public void run() {
        while (true) {
            try {
                doroha.trans();
            }
            catch (Exception e) {}
        }
    }
}
