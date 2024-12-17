package org.DesignPatterns.Creational.Factory.Vehicles;

public interface Vehicle {
    public int price=0;
    public abstract void setPrice(int p);
    public abstract boolean is_available();
}
