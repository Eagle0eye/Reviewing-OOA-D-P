package org.solid.ocp.interfaceclass;

import org.solid.ocp.abstractclass.emptypes.Manager;
import org.solid.ocp.abstractclass.emptypes.Shift;
import org.solid.ocp.abstractclass.emptypes.Staff;

public class run {
    public static void main(String[] args)
    {
        int extra_hours = 5;
        // Manager
        Manager manger;
        manger = new Manager();
        manger.setID(10);
        manger.setName("Joe");
        manger.setSalary(1000);
        manger.calcWorkingHours(extra_hours);

        System.out.printf("%s\nAll Salary = %.2f",manger.toString(),manger.calcWorkingHours(extra_hours));

        System.out.println();



        //Shift
        Shift shift;
        shift = new Shift();
        shift.setID(10);
        shift.setName("Hanady");
        shift.setSalary(1000);
        System.out.printf("%s\nAll Salary = %.2f",shift.toString(),shift.calcWorkingHours(extra_hours));
        System.out.println();

        // Staff
        Staff staff;
        staff = new Staff();
        staff.setID(10);
        staff.setName("Joe");
        staff.setSalary(1000);

        System.out.printf("%s\nAll Salary = %.2f",staff.toString(),staff.calcWorkingHours(extra_hours));
        System.out.println();
    }

}
