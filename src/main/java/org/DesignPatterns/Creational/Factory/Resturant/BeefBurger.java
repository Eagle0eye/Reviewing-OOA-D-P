package org.DesignPatterns.Creational.Factory.Resturant;

public class BeefBurger implements Burger{


    @Override
    public void prepare() {
        System.out.println("prepared Beef");
    }
}
