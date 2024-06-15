package main.java.test3.BTKeThua.Bai1;

import java.util.Scanner;

public class Student extends Person {
    private String id;
    private double averageScore;
    private String email;
    String regexEmail = "^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$";

    public Student() {
    }

    public Student(String name, String gender, String dateOfBirth, String address, String id, double averageScore, String email) {
        super(name, gender, dateOfBirth, address);
        this.id = id;
        this.averageScore = averageScore;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student ID: ");
        String id = sc.nextLine();
        if (id.length() == 8) {
            System.out.println("Enter Student average score: ");
            double averageScore = sc.nextDouble();
            sc.nextLine();
            if (averageScore >= 0.0 && averageScore <= 10.0) {
                System.out.println("Enter Student email: ");
                String email = sc.nextLine();
                if (email.matches(regexEmail)) {
                    this.setId(id);
                    this.setAverageScore(averageScore);
                    this.setEmail(email);
                    System.out.println("Done!");
                } else {
                    System.out.println("Invalid Email");
                }
            } else {
                System.out.println("Invalid Average Score");
            }
        } else {
            System.out.println("Invalid Student ID");
        }
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Student ID: " + id);
        System.out.println("Student average score: " + averageScore);
        System.out.println("Student email: " + email);
    }

    public boolean scholarshipCheck() {
        return averageScore >= 8.0;
    }
}
