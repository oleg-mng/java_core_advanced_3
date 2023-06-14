package org.inwork;

public class Program {
    public static void main(String[] args) {
        EmployeeHourWage employeeHourWage1 = new EmployeeHourWage("David", "IT", 100);
        System.out.println(employeeHourWage1.calcWage(530));
        System.out.println(employeeHourWage1.toString());
        EmployeeFixWage employeeFixWage1 = new EmployeeFixWage("Leonid", "IT", 70000);
        System.out.println(employeeFixWage1.calcWage(70000));
        System.out.println(employeeFixWage1.toString());


    }
}