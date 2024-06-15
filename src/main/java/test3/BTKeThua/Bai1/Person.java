package main.java.test3.BTKeThua.Bai1;

import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private String dateOfBirth;
    private String address;

    public Person() {
    }

    public Person(String name, String gender, String dateOfBirth, String address) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        this.name = sc.nextLine();
        System.out.println("Gender: ");
        this.gender = sc.nextLine();
        System.out.println("Date of Birth: ");
        this.dateOfBirth = sc.nextLine();
        System.out.println("Address: ");
        this.address = sc.nextLine();
    }
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Address: " + address);
    }
}
