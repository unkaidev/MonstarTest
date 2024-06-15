package main.java.test3.BTAbstractInterface.StudentsManageSystem;

import main.java.test3.BTAbstractInterface.StudentsManageSystem.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void showMenu() {
        System.out.println("----------");
        System.out.println("1. Insert Student");
        System.out.println("2. View List of Students");
        System.out.println("3. Search Student");
        System.out.println("4. Exit");
        System.out.println("Choose an option");
        System.out.println("----------");
    }

    public static Student insertStudent(Scanner sc) {
        System.out.println("Enter full name : ");
        String fullName = sc.nextLine();
        System.out.println("Enter date of birth : ");
        String dateOfBirth = sc.nextLine();
        System.out.println("Enter native : ");
        String nativeName = sc.nextLine();
        System.out.println("Enter class :");
        String className = sc.nextLine();
        System.out.println("Enter phone number : ");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter mobile number : ");
        int mobileNumber = sc.nextInt();
        return new Student(fullName, dateOfBirth, nativeName, className, phoneNumber, mobileNumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        while (true) {
            showMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    Student newStudent = insertStudent(sc);
                    students.add(newStudent);
                    break;
                case 2:
                    for (Student student : students) {
                        student.display();
                    }
                    break;
                case 3:
                    System.out.println("Enter full name : ");
                    String name = sc.nextLine();
                    for (Student student : students) {
                        if (name.equals(student.getFullName())) {
                            student.display();
                        } else {
                            System.out.println("Not found");
                        }
                    }
                    break;
                default:
                    return;
            }
        }
    }
}
