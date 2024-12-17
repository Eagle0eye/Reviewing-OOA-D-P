package org.DesignPatterns.Creational.Factory.Resturant;

public class VeggieBurgerRest  extends  Resturant{
    @Override
    public Burger CreateBurger(){ return new VeggileBurger(); }
}
