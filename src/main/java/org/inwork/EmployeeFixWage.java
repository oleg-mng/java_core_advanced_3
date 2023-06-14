package org.inwork;

public class EmployeeFixWage extends EmployeeBase {
    //    String name;
//    String depart;
    int salRate;

    public EmployeeFixWage(String name, String depart, int sal) {
        super.name = name;
        super.depart = depart;
        this.salRate = sal;
    }

    @Override
    public double calcWage(int rateSal) {
        avSalary = rateSal;
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
