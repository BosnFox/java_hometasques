package org.Reynard_de_Bosnie.lab2tasque4.lab2tasque4_2;

public class TextEditor {
    private String text;
    private Caretaker caretaker;
    public TextEditor(Caretaker caretaker) {
        this.caretaker = caretaker;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.caretaker.save(getText());
        this.text = text;
    }
    public void reset() {
        this.text = this.caretaker.undo();
    }
}
