package org.DesignPatterns.Creational.Builder.car;

public class Car {
    private final String name;
    private final int model;
    private final Type type;
    public static class Manufacture{
        private String name;
        private int model;
        private Type type;
        public Manufacture(){}
        public Car produce(){
            return new Car(this);
        }

        public Manufacture Name(String name) {
            this.name = name;
            return this;
        }

        public Manufacture Year(int model) {
            this.model = model;
            return this;
        }

        public Manufacture Type(Type type) {
            this.type = type;
            return this;
        }
    }

    public Car(Manufacture builder){
        this.name=builder.name;
        this.model=builder.model;
        this.type=builder.type;
    }


    public String getName() {
        return name;
    }
    public int getYear() {
        return model;
    }
    public Type getType() {
        return type;
    }
}
