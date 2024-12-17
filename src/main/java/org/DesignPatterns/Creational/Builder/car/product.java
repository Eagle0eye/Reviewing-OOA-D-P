package org.DesignPatterns.Creational.Builder.car;

public class product {
    public static void main(String[] args) {
        Car.Manufacture car = new Car.Manufacture();
        car.Name("Toyota").Year(2023).Type(Type.SEDAN).produce();
        Car produce_car =car.produce();
        System.out.println("Car Name: " + produce_car.getName());
        System.out.println("Car Year: " + produce_car.getYear());
        System.out.println("Car Type: " + produce_car.getType());
    }
}
