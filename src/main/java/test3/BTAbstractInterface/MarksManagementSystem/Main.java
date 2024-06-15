package main.java.test3.BTAbstractInterface.MarksManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static void showMenu() {
        System.out.println("------");
        System.out.println("1. Insert new student");
        System.out.println("2. View list of students");
        System.out.println("3. Average marks");
        System.out.println("4. Exit");
        System.out.println("Choose an option: ");
        System.out.println("------");
    }

    public static StudentMark insertStudent(Scanner sc) {
        System.out.println("Enter student name: ");
        String fullName = sc.nextLine();
        System.out.println("Enter student class : ");
        String className = sc.nextLine();
        System.out.println("Enter semester : ");
        String semester = sc.nextLine();
        return new StudentMark(fullName, className, semester);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<StudentMark> studentMarks = new ArrayList<>();
        while (true) {
            showMenu();
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    StudentMark studentMark = insertStudent(sc);
                    for (int i = 0; i < studentMark.subjectMarks.length; i++) {
                        System.out.println("Mark " + (i+1) + ":");
                        int price = sc.nextInt();
                        studentMark.subjectMarks[i] = price;
                    }
                    studentMarks.add(studentMark);
                    break;
                case 2:
                    for (StudentMark student : studentMarks) {
                        System.out.println("----");
                        student.display();
                        System.out.println("----");
                    }
                    break;
                case 3:
                    for (StudentMark student : studentMarks) {
                        student.averageCalculateMark();
                        System.out.println("----");
                        student.display();
                        System.out.println("----");
                    }
                    break;
                default:
                    return;
            }
        }
    }

}
