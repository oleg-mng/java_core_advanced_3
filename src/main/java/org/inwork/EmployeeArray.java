package org.inwork;

public class EmployeeArray extends EmployeeBase{

    public EmployeeArray(String name, String depart, int sal) {
        super.name = name;
        super.depart = depart;
        super.salaryRate = sal;
    }

    public static EmployeeArray[] employeeArrayBuild(){
        EmployeeArray[] employeeArrays = new EmployeeArray[]{
                new EmployeeArray("Olga", "IT", 530),
                new EmployeeArray("Roman", "IT", 570),
                new EmployeeArray("Rita", "IT", 690),
        };
        return employeeArrays;

    }
    public static void employeeArrayOutput(EmployeeArray[] employeeArrays){
        for (EmployeeArray employeeArray : employeeArrays) {
            employeeArray.calcWage();
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
}
