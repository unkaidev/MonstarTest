package main.java.test3.BTHuongDoiTuong.Bai03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TestStudent {
    private static void showMenu() {
        System.out.println("------------");
        System.out.println("1. Add a new student");
        System.out.println("2. Edit student by id");
        System.out.println("3. Delete student by id");
        System.out.println("4. Sort student by gpa");
        System.out.println("5. Sort student by name");
        System.out.println("6. Show all students");
        System.out.println("0. Exit");
        System.out.println("------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        while (true) {
            showMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> {
                    Student student = new Student();
                    student.inputInfo();
                    students.add(student);
                }
                case 2 -> {
                    System.out.println("Input student id:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    for (Student student : students) {
                        if (student.getId() == id) {
                            students.remove(student);
                            Student newStudent = new Student();
                            newStudent.editInfo(id);
                            students.add(newStudent);
                        } else {
                            System.out.println("Not Found ");
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Input student id:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    for (Student student : students) {
                        if (student.getId() == id) {
                            students.remove(student);
                        } else {
                            System.out.println("Not Found ");
                        }
                    }
                }
                case 4 -> {
                    Collections.sort(students, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return (int) (o2.getGpa() * 100 - o1.getGpa() * 100);
                        }
                    });
                    for (Student student : students) {
                        System.out.println("---------");
                        student.printInfo();
                        System.out.println("---------");
                    }
                }
                case 5 -> {
                    Collections.sort(students, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return (o2.getName().compareTo(o1.getName()));
                        }
                    });
                    for (Student student : students) {
                        System.out.println("---------");
                        student.printInfo();
                        System.out.println("---------");
                    }
                }
                case 6 -> {
                    for (Student student : students) {
                        System.out.println("---------");
                        student.printInfo();
                        System.out.println("---------");
                    }
                }
                default -> {
                    return;
                }
            }
        }
    }
}
