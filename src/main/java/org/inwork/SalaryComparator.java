package org.inwork;

import java.util.Comparator;

public class SalaryComparator implements Comparator<EmployeeArray> {
    @Override
    public int compare(EmployeeArray o1, EmployeeArray o2) {
//        return (int) (o1.avSalary - o2.avSalary);
        return o1.getName().compareTo(o2.getName());
    }


//    @Override
//    public int compare(EmployeeBase o1, EmployeeBase o2) {
//        return Double.compare(o1.avSalary, o2.avSalary);
//    }
}
