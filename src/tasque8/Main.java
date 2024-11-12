package tasque8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] names = {"книга", "ручка", "линейка", "пинал"};
        ShopItem[] items = new ShopItem[100];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int ID = random.nextInt(names.length);
            String name = names[ID];
           // String name = ;
            double price = random.nextInt(2000);
            ShopItem item = new ShopItem(name, price, ID);
            items[i] = item;
            item = null;
        }
        Arrays.sort(items);
        for (ShopItem item : items) {
            System.out.println(item.toString());
        }
    }
}
