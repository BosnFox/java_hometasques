package lab2tasque4.lab2tasque4_1;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private int currentPrice;
    private String company;
    private List<stockObserver> subscribers;
    public Stock(int currentPrice, String company) {
        subscribers = new ArrayList<stockObserver>();
        this.currentPrice = currentPrice;
        this.company = company;
    }
    public void addObserver(stockObserver observer) {
        subscribers.add(observer);
    }
    public void removeObserver(stockObserver observer) {
        subscribers.remove(observer);
    }
    public void notifyObservers(int delta) {
        for (stockObserver observer : subscribers) {
            observer.update(company, delta);
        }
    }
    public int getCurrentPrice() {
        return currentPrice;
    }
    public void setCurrentPrice(int newPrice) {
        notifyObservers(newPrice - currentPrice);
        this.currentPrice = newPrice;
    }
}
