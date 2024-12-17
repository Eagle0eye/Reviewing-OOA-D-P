package org.DesignPatterns.Creational.Builder.car;

public enum Type {
    SUV,SEDAN,SPORT;

    @Override
    public String toString() {
        switch (this) {
            case SUV:
                return "suv";
            case SEDAN:
                return "sedan";
            case SPORT:
                return "sport";
            default: return "unknown";
        }
    }
}
