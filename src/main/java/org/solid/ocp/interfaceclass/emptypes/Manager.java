package org.solid.ocp.interfaceclass.emptypes;

import org.solid.ocp.abstractclass.Employee;
import org.solid.ocp.interfaceclass.IEmployee;

public class Manager extends Employee implements IEmployee {
    public float calcWorkingHours(int hours) {
        return ((this.getSalary() / 30) / 8)*2;
    }
    
}

