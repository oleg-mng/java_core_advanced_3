package org.inwork;

public abstract class EmployeeBase {
    String name;
    String depart;
    double avSalary;
    double salaryRate;

    public double calcWage() {
        avSalary = salaryRate * 20.8 * 8;
        return avSalary;

    }
}
