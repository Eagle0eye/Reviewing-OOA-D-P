package org.solid.srp.store;

public class run {
    public static void main(String[] args)
    {
        Stock stock = new Stock();
        stock.getItems();
        ShoppingCart shoppingCart = new ShoppingCart(stock);
        System.out.println();

        // Add Items
        shoppingCart.add_toCart("123");
        shoppingCart.add_toCart("122");
        shoppingCart.add_toCart("233");
        shoppingCart.add_toCart("232");
        System.out.println();

        // Display Cart
        shoppingCart.getItems();
        System.out.println();

        // Remove Item
        shoppingCart.removeItem("232");
        System.out.println();

        // Display Cart
        shoppingCart.getItems();
        System.out.println();

    }

}
