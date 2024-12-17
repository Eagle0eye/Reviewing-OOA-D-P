package org.DesignPatterns.Creational.Factory.Vehicles;

public class FourWheels implements Vehicle{
    int price=0;
    @Override
    public void setPrice(int p) {
        price =p;
    }

    @Override
    public boolean is_available() {
        if (price>Vehicle.price)
            return true;
        return false;
    }
}
