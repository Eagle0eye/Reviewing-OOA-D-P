package org.solid.srp.store;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class OperationList {
    private OperationList() {}

    public static Item remove(String code, List<Item> items) {
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (Objects.equals(code, item.getCode())) {
                iterator.remove();
                return item;
            }
        }
        return null;
    }

    public static void addItem(Item item, List<Item> items) {
        items.add(item);
    }

    public static Item search(String code, List<Item> items) {
        for (Item item : items) {
            if (Objects.equals(code, item.getCode())) {
                return item;
            }
        }
        return null;
    }

    protected static void display(List<Item> items) {
        for (Item item : items) {
            if (item != null) {
                System.out.printf("code: %s\tQuantity: %2d \tPrice: %.2f%n", item.getCode(), item.getQuantity(), item.getPrice());
            } else {
                System.out.println("Item Not Found");
            }
        }
    }
}
