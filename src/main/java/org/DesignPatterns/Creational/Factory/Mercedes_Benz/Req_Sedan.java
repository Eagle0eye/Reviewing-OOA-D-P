package org.DesignPatterns.Creational.Factory.Mercedes_Benz;

public class Req_Sedan extends  RequestCar{

    @Override
    public Car order_car() {
        return new Sedan();
    }
}
