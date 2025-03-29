package lab2tasque4.lab2tasque4_1;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock(0, "BaoBag Inc.");
        Stock stock2 = new Stock(1000, "BaoBaZhuo Inc.");
        MobileApp gook = new MobileApp("Daoyu Zhou");
        stock.addObserver(gook);
        stock.setCurrentPrice(100);
        stock.addObserver(new EmailNotifier("baobag@meizhu.ch"));
        stock.setCurrentPrice(200);
        stock2.addObserver(new EmailNotifier("baoba@meizhu.ch"));
        stock2.setCurrentPrice(300);
    }
}
