package org.Reynard_de_Bosnie.tasque8;

public class ShopItem implements Comparable<ShopItem> {
    private String itemName;
    private double itemPrice;
    private int itemID;

    public ShopItem(String itemName, double itemPrice, int itemID) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemID = itemID;
    }

    @Override
    public int compareTo(ShopItem o) { // TODO alefbet sort first
        if (this.itemPrice < o.itemPrice) {
            return -1;
        }
        if (this.itemPrice > o.itemPrice) {
            return 1;
        }
        return 0;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemID() {
        return itemID;
    }

    @Override
    public String toString() {
        return getItemName() + ", price: " + getItemPrice();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() == ShopItem.class) {
            ShopItem other = (ShopItem) obj;
            return getItemName().equals(other.getItemName())
                    && getItemPrice() == other.getItemPrice();
        }
        return false;
    }


}
