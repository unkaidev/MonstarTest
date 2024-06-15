package main.java.test3.BTKeThua.Bai1;

import java.util.Scanner;

public class Teacher extends Person {
    private String teacherClass;
    private int salaryPerHour;
    private double hour;
    String regexClass = "^C\\d{4}[GHIKLM]$";

    public Teacher() {
    }

    public Teacher(String name, String gender, String dateOfBirth, String address, String teacherClass, int salaryPerHour, double hour) {
        super(name, gender, dateOfBirth, address);
        this.teacherClass = teacherClass;
        this.salaryPerHour = salaryPerHour;
        this.hour = hour;
    }

    public String getTeacherClass() {
        return teacherClass;
    }

    public void setTeacherClass(String teacherClass) {
        this.teacherClass = teacherClass;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Teacher Class: ");
        String teacherClass = sc.nextLine();
        if (teacherClass.matches(regexClass)) {
            System.out.println("Enter Salary Per Hour: ");
            int salaryPerHour = sc.nextInt();
            System.out.println("Enter Hour: ");
            double hour = sc.nextDouble();
            sc.nextLine();
            this.teacherClass = teacherClass;
            this.salaryPerHour = salaryPerHour;
            this.hour = hour;
            System.out.println("Done! ");
        } else {
            System.out.println("Invalid Teacher Class");
        }
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Teacher Class: " + teacherClass);
        System.out.println("Salary Per Hour: " + salaryPerHour);
        System.out.println("Hour: " + hour);
    }

    public int calculateSalary() {
        String teacherClass = this.getTeacherClass();
        char specialCharClass = teacherClass.charAt(teacherClass.length()-1);
        if(specialCharClass =='G'
        || specialCharClass=='C'
        || specialCharClass=='M'
        || specialCharClass=='P') {
            return (int) (this.getHour()*this.getSalaryPerHour());
        }else {
            return (int) (this.getHour()*this.getSalaryPerHour()+200000);
        }
    }
}
