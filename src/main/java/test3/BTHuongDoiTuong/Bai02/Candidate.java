package main.java.test3.BTHuongDoiTuong.Bai02;

import java.util.Scanner;

public class Candidate {
    private int id;
    private String name;
    private String dateOfBirth;
    private double math;
    private double literature;
    private double english;

    public Candidate() {
    }

    public Candidate(int id, String name, String dateOfBirth, double math, double literature, double english) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.math = math;
        this.literature = literature;
        this.english = english;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getLiterature() {
        return literature;
    }

    public void setLiterature(double literature) {
        this.literature = literature;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào id thí sinh : ");
        this.id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vào tên thí sinh : ");
        this.name = sc.nextLine();
        System.out.println("Nhập vào ngày sinh : ");
        this.dateOfBirth = sc.nextLine();
        System.out.println("Nhập vào điểm môn Toán");
        this.math = sc.nextDouble();
        System.out.println("Nhập vào điểm môn Văn");
        this.literature = sc.nextDouble();
        System.out.println("Nhập vào điểm môn Anh");
        this.english = sc.nextDouble();
    }
    public void printInfo(){
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Date of Birth : " + dateOfBirth);
        System.out.println("Math : " + math);
        System.out.println("Literature : " + literature);
        System.out.println("English : " + english);
    }
}
