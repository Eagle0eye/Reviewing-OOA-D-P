package org.DesignPatterns.Creational.Factory.Vehicles;

public class Req_2w extends CreateVehicle{

    @Override
    public void fill_data(int price) {
        cur_price=price;
        System.out.println("2Wheels");

    }
}
