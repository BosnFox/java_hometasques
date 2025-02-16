package lab2tasque1.lab2tasque1_2;

abstract public class CoffeeDecorator implements ICoffee {
    private ICoffee coffee;
    public CoffeeDecorator(ICoffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public int getPrice() {
        return coffee.getPrice();
    }
    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
}
