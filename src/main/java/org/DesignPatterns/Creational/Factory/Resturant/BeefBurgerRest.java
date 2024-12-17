package org.DesignPatterns.Creational.Factory.Resturant;

public class BeefBurgerRest extends Resturant {

    @Override
    public Burger CreateBurger() {
        return new BeefBurger();
    }
}
