package org.inwork;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeArray extends EmployeeBase implements Comparable<EmployeeArray>{

    public EmployeeArray(String name, String depart, int sal) {
        super.name = name;
        super.depart = depart;
        super.salaryRate = sal;
    }

//    EmployeeArray[] emp3 = new EmployeeArray[]{
//            (EmployeeArray) new EmployeeHourWage("Michael", "IT", 100),
//            new EmployeeFixWage("Michael", "IT", 100),
//    }

//    EmployeeHourWage emp1 = new EmployeeHourWage("Michael", "IT", 100);
//    EmployeeFixWage emp2 = new EmployeeFixWage("Michael", "IT", 100);

    public static EmployeeArray[] employeeArrayBuild(){
        EmployeeArray[] employeeArrays = new EmployeeArray[]{
                new EmployeeArray("Olga", "IT", 530),
                new EmployeeArray("Roman", "IT", 1200),
                new EmployeeArray("Rita", "IT", 690),
                new EmployeeArray("Andrey", "IT", 790),
        };
        SalaryComparator salaryComparator = new SalaryComparator();
        Arrays.stream(employeeArrays).sorted(salaryComparator);
//        Arrays.sort(employeeArrays);
//        Comparator<Object> comparator = Comparator.comparing(obj -> obj.getClass());
//        Collections.sort(employeeArrays, comparator);
        return employeeArrays;

    }
    public static void employeeArrayOutput(EmployeeArray[] employeeArrays){
        for (EmployeeArray employeeArray : employeeArrays) {
            employeeArray.calcWage();
            employeeArray.compareTo(employeeArray);


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


    @Override
    public int compareTo(EmployeeArray e) {
        if (this.salaryRate == e.salaryRate) return 0;
        if (this.salaryRate < e.salaryRate) return -1;
        else return 1;
//        return name.compareTo(e.getName());
    }


}
