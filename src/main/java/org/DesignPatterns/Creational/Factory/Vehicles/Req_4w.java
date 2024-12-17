package org.DesignPatterns.Creational.Factory.Vehicles;

public class Req_4w extends CreateVehicle{
    @Override
    public void fill_data(int price) {
        cur_price=price;
        System.out.println("4Wheels");
    }
}
