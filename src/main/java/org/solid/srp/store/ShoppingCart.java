package org.solid.srp.store;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShoppingCart {
    private List<Item> cartItems;
    private List<Item> stockItems;
    private ShoppingCart(){}
    public ShoppingCart(Stock stock){
        cartItems = new ArrayList<Item>();
        this.stockItems = stock.items;
        System.out.println("cart size:"+cartItems.size());

    }
    public void add_toCart(String code){
        System.out.println("add to cart");
        for (int count=0;count<stockItems.size();count++)
            if(Objects.equals(code, stockItems.get(count).getCode()))
                if (stockItems.get(count).isAvailable())
                {       cartItems.add(stockItems.get(count));
                        break;
                }

    }

    public void purchase(){
        System.out.println("Purchase");
        for(Item item: cartItems){
            item.decreaseQuantity();
        }
        System.out.println("All Bought");
        cartItems.clear();
    }
    public void getItems(){
        System.out.println("Display Cart Items");
        OperationList.display(cartItems);
    }


    public void removeItem(String code){
        System.out.println("Remove item");
        OperationList.remove(code, this.cartItems);

    }
}
