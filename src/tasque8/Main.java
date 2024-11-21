package tasque8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] names = {"книга", "ручка", "линейка", "пинал"};
        ShopItem[] items = new ShopItem[101];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int ID = random.nextInt(names.length);
            String name = names[ID];
            double price = random.nextInt(2000);
            ShopItem item = new ShopItem(name, price, ID);
            items[i] = item;
            item = null;
        }
        items[100] = items[random.nextInt(100)];
        Arrays.sort(items, Comparator.comparing(ShopItem::getItemName).thenComparing(ShopItem::getItemPrice));
        for (ShopItem item : items) {
            System.out.println(item.toString());
        }
        System.out.print("Collisions: ");
        Set<ShopItem> collisions = new HashSet<>(Arrays.asList(items));
        System.out.println(items.length - collisions.size());
        collisions = null;
    }
}
