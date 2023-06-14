package org.inwork;

public abstract class EmployeeBase {
    String name;
    String depart;
    double avSalary;

    public double calcWage(int rateSal) {
        avSalary = rateSal * 20.8 * 8;
        return avSalary;

    }
}
