package org.inwork;

import java.util.Comparator;

public class SalaryComparator implements Comparator<EmployeeArray> {
    @Override
    public int compare(EmployeeArray o1, EmployeeArray o2) {
        if (o1.salaryRate == o2.salaryRate) return 0;
        if (o1.salaryRate < o2.salaryRate) return -1;
        else return 1;
    }
}
