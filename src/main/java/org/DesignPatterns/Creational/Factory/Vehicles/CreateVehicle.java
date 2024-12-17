package org.DesignPatterns.Creational.Factory.Vehicles;

public abstract class CreateVehicle {
    protected int cur_price=0;
    public Vehicle Create(VehicleType vt){
        if(VehicleType.TWO_WHEELS.compareTo(vt)==0) {
            return new TwoWheels();
        }
        else if (VehicleType.THREE_WHEELS.compareTo(vt)==0)
        {
            return  new ThreeWheels();
        }
        else if (VehicleType.FOUR_WHEELS.compareTo(vt)==0)
        {
            return new FourWheels();
        }
        return null;

    }
    public abstract void fill_data(int price);
}
