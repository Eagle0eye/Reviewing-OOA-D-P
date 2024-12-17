package org.solid.ocp.interfaceclass;

public abstract class  Employee {
    private int ID;
    private String name;
    private float salary;

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", net salary=" + salary +
                '}',this.getClass().getSimpleName());
    }
}
