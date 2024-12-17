package org.DesignPatterns.Creational.Factory.Vehicles;

public class Req_3w extends CreateVehicle{

    @Override
    public void fill_data(int price) {
        cur_price=price;
        System.out.println("3Wheels");
    }
}
