package org.solid.srp.store;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Stock {
    protected final List<Item> items;
    public Stock(){
        items = new ArrayList<>();
        items.add(new Item("123",120,5, true));
        items.add(new Item("324",124,14,true));
        items.add(new Item("232",157,12,true));
        items.add(new Item("122",167,22,true));
        items.add(new Item("233",120,12,false));
    }

    public void addStock(String code,float price,int quantity, boolean available){
        Item item = new Item(code, price, quantity, available);
        OperationList.addItem(item,items);
        item.increaseQuantity();
    }

    public void modify_stock_availability(String code){
            Item item = OperationList.search(code,items);
            assert item != null;
            item.chAvailable();
    }
    public void getItems(){
        System.out.println("Print Stock Items");
        OperationList.display(items);}
    public void decreaseItem(String code, List<Item> items){
        Item item = OperationList.search(code,items);
        assert item != null;
        item.decreaseQuantity();
    }
}
