package org.Reynard_de_Bosnie.tasque20;
import java.util.ArrayList;
import java.util.List;

public class Box<T extends Number> {
    private List<T> elements;

    public Box() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public double sum() {
        double sum = 0;
        for (T element : this.elements) {
            sum += element.doubleValue();
        }
        return sum;
    }
}
