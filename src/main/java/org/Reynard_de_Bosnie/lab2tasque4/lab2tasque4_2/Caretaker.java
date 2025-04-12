package org.Reynard_de_Bosnie.lab2tasque4.lab2tasque4_2;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> states = new ArrayList<Memento>();
    public Caretaker() {
    }
    void save(String text) {
        states.add(new Memento(text));
        if (states.size() > 5) {
            states.remove(0);
        }
    }
    String undo() {
        Memento last = states.get(states.size() - 1);
        states.remove(states.size() - 1);
        return last.getCurrentState();
    }
}
