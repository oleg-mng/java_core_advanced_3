package org.inwork;

public class EmployeeArray extends EmployeeFixWage{

    public EmployeeArray(String name, String depart, int sal) {
        super(name, depart, sal);
    }

    public EmployeeArray[] employeeArrayBuild(){
        EmployeeArray[] employeeArrays = {
                (EmployeeArray) new EmployeeFixWage("Piter", "IT", 90000),
                (EmployeeArray) new EmployeeFixWage("Olga", "IT", 97000),
                new EmployeeArray("Roman", "IT", 78000),
        };
        return employeeArrays;

    }
    public void employeeArrayOutput(){

    }

}
