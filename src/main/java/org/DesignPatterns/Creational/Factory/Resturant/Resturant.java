package org.DesignPatterns.Creational.Factory.Resturant;

public abstract class Resturant {
    public Burger orderRequest(){
        Burger burger= CreateBurger();
        burger.prepare();
        return burger;
    }
    public abstract Burger CreateBurger();
}
