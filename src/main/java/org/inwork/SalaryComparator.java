package org.inwork;

import java.util.Comparator;

public class SalaryComparator implements Comparator<EmployeeArray> {
    @Override
    public int compare(EmployeeArray o1, EmployeeArray o2) {
        return (int) (o1.getAvSalary() - o2.getAvSalary());
    }
}
