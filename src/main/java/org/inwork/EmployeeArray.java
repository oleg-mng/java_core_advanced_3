package org.inwork;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeArray extends EmployeeBase implements Comparable<EmployeeArray> {

    public EmployeeArray(String name, String depart, int sal) {
        super.name = name;
        super.depart = depart;
        super.salaryRate = sal;
    }
    @Override
    public int compareTo(EmployeeArray e) {
//        return (int) (this.getName().compareTo(e.getName()));
//        return Double.compare(this.getAvSalary(), e.getAvSalary());
//        return (int) (this.getAvSalary() - e.getAvSalary());
        return (int) (this.salaryRate - e.salaryRate);

    }

//    EmployeeArray[] emp3 = new EmployeeArray[]{
//            (EmployeeArray) new EmployeeHourWage("Michael", "IT", 100),
//            new EmployeeFixWage("Michael", "IT", 100),
//    }

//    EmployeeHourWage emp1 = new EmployeeHourWage("Michael", "IT", 100);
//    EmployeeFixWage emp2 = new EmployeeFixWage("Michael", "IT", 100);

    public static EmployeeArray[] employeeArrayBuild(){
        EmployeeArray[] employeeArrays = new EmployeeArray[]
                {
                new EmployeeArray("Olga", "IT", 530),
                new EmployeeArray("Roman", "IT", 1200),
                new EmployeeArray("Rita", "IT", 690),
                new EmployeeArray("Andrey", "IT", 790),
        };
//        Collections.sort(employeeArrays, salaryComparator);
//
//        Arrays.sort(employeeArrays, new SalaryComparator());
//        Comparator<Object> comparator = Comparator.comparing(obj -> obj.getClass());
//        Collections.sort(employeeArrays, comparator);

        return employeeArrays;

    }
    public static EmployeeArray[] sortAr(EmployeeArray[] ar) {
        Arrays.sort(ar, new SalaryComparator());
        return ar;
    }

    public static void employeeArrayOutput(EmployeeArray[] employeeArrays){

        for (EmployeeArray employeeArray : employeeArrays) {
            employeeArray.calcWage();
//            employeeArray.compareTo(employeeArray);
            System.out.println(employeeArray.toString());
        }
    }

    @Override
    public double calcWage() {
        return super.calcWage();
    }

    @Override
    public String toString() {
        return "EmployeeArray{" +
                "name='" + name + '\'' +
                ", depart='" + depart + '\'' +
                ", avSalary=" + avSalary +
                '}';
    }

    String getName(){
        return name;
    }
    Double getAvSalary(){
        return avSalary;
    }

//    @Override
//    public int compare(EmployeeArray o1, EmployeeArray o2) {
//        return (int) (o1.avSalary - o2.avSalary);
//    }
}
