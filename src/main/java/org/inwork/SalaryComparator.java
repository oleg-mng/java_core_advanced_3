package org.inwork;

import java.util.Comparator;

public class SalaryComparator implements Comparator<EmployeeArray> {
    @Override
    public int compare(EmployeeArray o1, EmployeeArray o2) {
//        return (int) (o1.avSalary - o2.avSalary);
//        return o1.getName().compareTo(o2.getName());
//        return (int) (o1.salaryRate - o2.salaryRate);
        return (int) (o1.calcWage() - o2.calcWage());
    }


//    @Override
//    public int compare(EmployeeBase o1, EmployeeBase o2) {
//        return Double.compare(o1.avSalary, o2.avSalary);
//    }
}
