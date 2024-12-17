package org.DesignPatterns.Creational.Factory.Mercedes_Benz;

public abstract class RequestCar {
    public Car buy_car(){
        Car car = order_car();
        System.out.println(car.car_name());
        return car;
    }
    public abstract Car order_car();
}
