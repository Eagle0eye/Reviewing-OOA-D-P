package org.solid.ocp.abstractclass.emptypes;

import org.solid.ocp.abstractclass.Employee;

public class Shift extends Employee {
    @Override
    public float calcWorkingHours(int hours) {
        return ((this.getSalary() / 30) / 8)* ((float) 3 / 2);
    }
}
