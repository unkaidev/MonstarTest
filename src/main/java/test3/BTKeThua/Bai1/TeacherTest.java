package main.java.test3.BTKeThua.Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TeacherTest {
    private static final Teacher teacher = new Teacher();
    private static final ArrayList<Teacher> teachers = new ArrayList<>();

    public static void showMenu() {
        System.out.println("-----");
        System.out.println("Chọn 1. Nhập thông tin của n giáo viên");
        System.out.println("Chọn 2. Hiển thị tất cả giáo viên");
        System.out.println("Chọn 3. Hiển thị giáo viên có lương cao nhất");
        System.out.println("Chọn 4. Thoát");
        System.out.println("Mời nhập số: ");
    }

    public static void inputInfoManyTeachers(Scanner sc) {
        System.out.println("Nhập vào số lượng giáo viên n: ");
        int n = sc.nextInt();
        sc.nextLine();
        String regexClass = "^C\\d{4}[GHIKLM]$";
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho giáo viên thứ " + (i + 1) + ":");
            Teacher teacher = new Teacher();
            teacher.inputInfo();
            if (!teacher.getTeacherClass().matches(regexClass)) {
                teachers.add(teacher);
            } else {
                System.out.println("Invalid Teacher Class, stopping input.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            showMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> {
                    inputInfoManyTeachers(sc);
                }
                case 2 -> {
                    for (Teacher teacher : teachers) {
                        teacher.showInfo();
                    }
                }
                case 3 -> {
                    Teacher teacherHasMaxSalary =
                            Collections.max(teachers, new Comparator<Teacher>() {
                                @Override
                                public int compare(Teacher o1, Teacher o2) {
                                    return (o2.calculateSalary() - o1.calculateSalary());
                                }
                            });
                    teacherHasMaxSalary.showInfo();
                }
                default -> {
                    return;
                }
            }

        }
    }
}
