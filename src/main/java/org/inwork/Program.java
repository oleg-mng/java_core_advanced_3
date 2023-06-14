package org.inwork;

public class Program {
    public static void main(String[] args) {
        EmployeeHourWage employeeHourWage1 = new EmployeeHourWage("David", "IT", 540);
        System.out.println(employeeHourWage1.calcWage());
        System.out.println(employeeHourWage1.toString());
        EmployeeFixWage employeeFixWage1 = new EmployeeFixWage("Leonid", "IT", 70000);
        System.out.println(employeeFixWage1.calcWage());
        System.out.println(employeeFixWage1.toString());
        System.out.println();
        System.out.println("Employee data array: ");

        EmployeeBase[] employeeBases = {
                new EmployeeHourWage("John", "IT", 580),
                new EmployeeHourWage("Petra", "Sale", 890),
                new EmployeeFixWage("Steven", "IT", 120000),
                new EmployeeFixWage("Steven", "IT", 80000),
                new EmployeeHourWage("Petra", "Sale", 630),
        };
        for (EmployeeBase employeeBase : employeeBases) {
            employeeBase.calcWage();
            System.out.println(employeeBase.toString());
        }

        System.out.println("realization output for class EmployeeArray: ");


    }
}