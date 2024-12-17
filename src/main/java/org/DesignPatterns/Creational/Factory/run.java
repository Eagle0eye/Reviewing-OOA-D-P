package org.DesignPatterns.Creational.Factory;

// Resturant App
import org.DesignPatterns.Creational.Factory.Resturant.BeefBurgerRest;
import org.DesignPatterns.Creational.Factory.Resturant.VeggieBurgerRest;

// Mercedes_Benz App
import org.DesignPatterns.Creational.Factory.Mercedes_Benz.Req_Sport;
import org.DesignPatterns.Creational.Factory.Mercedes_Benz.Req_Sedan;
import org.DesignPatterns.Creational.Factory.Mercedes_Benz.Req_SUV;
// Vehicles App
import org.DesignPatterns.Creational.Factory.Vehicles.*;


public class run {
    public static void main(String[] args) {

        // Resturant App

        VeggieBurgerRest veggie_burger = new VeggieBurgerRest();
        veggie_burger.orderRequest();

        BeefBurgerRest beef_burger= new BeefBurgerRest();
        beef_burger.orderRequest();

        // Mercedes_Benz App

        Req_Sedan sedan = new Req_Sedan();
        sedan.buy_car();

        Req_Sport sport =new Req_Sport();
        sport.buy_car();

        Req_SUV suv =new Req_SUV();
        suv.buy_car();

        // Vehicles App
        Req_2w r1 = new Req_2w();
        Req_3w r2 = new Req_3w();
        Req_4w r3 = new Req_4w();


        r1.fill_data(5);
        r2.fill_data(5);
        r3.fill_data(5);


        Vehicle v2 = new Req_2w().Create(VehicleType.TWO_WHEELS);
        v2.setPrice(0);
        System.out.println(v2.is_available());


        Vehicle v3 = new Req_3w().Create(VehicleType.THREE_WHEELS);
        v3.setPrice(12);
        System.out.println(v3.is_available());

        Vehicle v4 = new Req_4w().Create(VehicleType.FOUR_WHEELS);
        v4.setPrice(100);
        System.out.println(v4.is_available());

    }
}