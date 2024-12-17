package org.DesignPatterns.Creational.Factory.Resturant;

public class VeggileBurger implements Burger{

    @Override
    public void prepare(){
        System.out.println("prepared Veggie");
    }
}
