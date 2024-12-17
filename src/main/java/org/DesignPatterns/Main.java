package org.DesignPatterns;

import org.DesignPatterns.Creational.Factory.Resturant.VeggieBurgerRest;
import org.DesignPatterns.Creational.Factory.Resturant.BeefBurgerRest;

public class Main {
    public static void main(String[] args) {

        VeggieBurgerRest veggie_burger = new VeggieBurgerRest();
        veggie_burger.orderRequest();

        BeefBurgerRest beef_burger= new BeefBurgerRest();
        beef_burger.orderRequest();
    }
}