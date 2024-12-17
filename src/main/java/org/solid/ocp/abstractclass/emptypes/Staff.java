package org.solid.ocp.abstractclass.emptypes;

import org.solid.ocp.abstractclass.Employee;

public class Staff extends Employee {
    @Override
    public float calcWorkingHours(int hours) {
        return ((this.getSalary() / 30) / 8)*hours;
    }
}
