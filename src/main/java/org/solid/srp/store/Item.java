package org.solid.srp.store;

import java.util.List;
import java.util.Queue;

public class Item {
    private String code;
    private float price;
    private int quantity;
    private boolean available;
    private Item(){
        System.out.println("Add your Items");
    }

    public Item(String code,float price,int quantity){
        this.code = code;
        this.price = price;
        this.quantity = quantity;
     }
    public Item(String code,float price,int quantity, boolean available){
        this.code = code;
        this.price = price;
        this.quantity = quantity;
        this.available = available;
    }

    public String getCode() {
        return code;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isAvailable(){
        return available;
    }
    public void chAvailable(){
        if(isAvailable())
            available = false;
        else
            available=true;
    }

    public void increaseQuantity(){
        ++quantity;
    }

    public void decreaseQuantity(){
        --quantity;
    }
}
