package lab2tasque1.lab2tasque1_2;

public class Main {
    public static void main(String[] args) {
        ICoffee coffee = new Espresso();
        System.out.println("Price: " + coffee.getPrice() + " F; Description: " + coffee.getDescription());

        coffee = new Milk(coffee);
        System.out.println("Price: " + coffee.getPrice() + " F; Description: " + coffee.getDescription());

        coffee = new Caramel(coffee);
        System.out.println("Price: " + coffee.getPrice() + " F; Description: " + coffee.getDescription());
    }
}
