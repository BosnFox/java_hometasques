package org.Reynard_de_Bosnie.lab2tasque4.lab2tasque4_2;

public class Memento {
    private String currentState;
    public Memento(String currentState) {
        this.currentState = currentState;
    }
    public String getCurrentState() {
        return currentState;
    }
}
