package org.inwork;

public class EmployeeFixWage extends EmployeeBase {
    //    String name;
//    String depart;
    int salRate;

    public EmployeeFixWage(String name, String depart, int sal) {
        super.name = name;
        super.depart = depart;
        super.salaryRate = sal;
    }

    @Override
    public double calcWage() {
        avSalary = salaryRate;
        return avSalary;
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
