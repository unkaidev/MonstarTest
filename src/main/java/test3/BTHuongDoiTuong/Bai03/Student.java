package main.java.test3.BTHuongDoiTuong.Bai03;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private double gpa;

    public Student() {
    }

    public Student(int id, String name, int age, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input ID: ");
        this.id = sc.nextInt();
        sc.nextLine();
        System.out.println("Input Name: ");
        this.name = sc.nextLine();
        System.out.println("Input Age: ");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Input Address: ");
        this.address = sc.nextLine();
        System.out.println("Input GPA: ");
        this.gpa = sc.nextDouble();
    }

    public void editInfo(int id) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name: ");
        this.name = sc.nextLine();
        System.out.println("Input age: ");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Input address: ");
        this.address = sc.nextLine();
        System.out.println("Input gpa: ");
        this.gpa = sc.nextDouble();
    }
    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("GPA: " + gpa);
    }
}
