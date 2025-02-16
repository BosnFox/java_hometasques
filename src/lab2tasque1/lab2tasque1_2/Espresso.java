package lab2tasque1.lab2tasque1_2;

public class Espresso implements ICoffee {
    int price = 10;
    String description = "it's sort of a " + this.getClass().getSimpleName() +" duh";
    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public String getDescription() {
        return description;
    }
}
