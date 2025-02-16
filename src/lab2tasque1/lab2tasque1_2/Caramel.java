package lab2tasque1.lab2tasque1_2;

public class Caramel extends CoffeeDecorator {
    public Caramel (ICoffee coffee) {
        super(coffee);
    }
    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", w/ some sweet";
    }
}

