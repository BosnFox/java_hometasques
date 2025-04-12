package org.Reynard_de_Bosnie.lab2tasque1.lab2tasque1_2;

public class Milk extends CoffeeDecorator {
    public Milk (ICoffee coffee) {
        super(coffee);
    }
    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", w/ some milk";
    }
}
