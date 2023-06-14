package org.inwork;

public class EmployeeHourWage extends EmployeeBase {
    //    String name;
//    String depart;
//    int salRate;

    public EmployeeHourWage(String name, String depart, int sal) {
        super.name = name;
        super.depart = depart;
        super.salaryRate = sal;
    }

    @Override
    public double calcWage() {
        return super.calcWage();
    }

    @Override
    public String toString() {
        return "EmployeeHourWage{" +
                "name='" + name + '\'' +
                ", depart='" + depart + '\'' +
                ", avSalary=" + avSalary +
                '}';
    }
}
