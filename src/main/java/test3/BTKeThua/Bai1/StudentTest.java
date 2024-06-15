package main.java.test3.BTKeThua.Bai1;

import java.util.*;

public class StudentTest {
    private static final Student student = new Student();
    private static final ArrayList<Student> students = new ArrayList<>();

    public static void showMenu() {
        System.out.println("-----");
        System.out.println("Chọn 1. Nhập thông tin của n sinh viên");
        System.out.println("Chọn 2. Hiển thị tất cả sinh viên");
        System.out.println("Chọn 3. Hiển thị sinh viên có điểm trung bình cao và thấp nhất");
        System.out.println("Chọn 4. Tìm kiếm theo mã sinh viên");
        System.out.println("Chọn 5. Hiển thị tên sinh viên theo A-Z");
        System.out.println("Chọn 6. Hiển thị sinh viên được học bổng và sắp xếp từ cao đến thấp");
        System.out.println("Chọn 7. Thoát");
        System.out.println("Mời nhập số: ");
    }

    public static void inputInfoManyStudents(Scanner sc) {
        System.out.println("Nhập vào số lượng sinh viên n: ");
        int n = sc.nextInt();
        sc.nextLine();
        String regexEmail = "^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$";
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
            Student student = new Student();
            student.inputInfo();
            if (student.getId() != null && !student.getId().isEmpty() &&
                    student.getAverageScore() >= 0.0 && student.getAverageScore() <= 10.0 &&
                    student.getEmail() != null && student.getEmail().matches(regexEmail)) {
                students.add(student);
            } else {
                System.out.println("Invalid Student Information, stopping input.");
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
                    inputInfoManyStudents(sc);
                }
                case 2 -> {
                    for (Student student : students) {
                        System.out.println("-----");
                        student.showInfo();
                        System.out.println("-----");
                    }
                }
                case 3 -> {
                    ArrayList<Double> listScore = new ArrayList<>();
                    for (Student student : students) {
                        listScore.add(student.getAverageScore());
                    }
                    for (Student student : students) {
                        if (student.getAverageScore() == Collections.max(listScore)) {
                            System.out.println("Sinh viên có điểm trung bình cao nhất");
                            System.out.println("-----");
                            student.showInfo();
                            System.out.println("-----");
                        }
                        if (student.getAverageScore() == Collections.min(listScore)) {
                            System.out.println("Sinh viên có điểm trung bình thấp nhất");
                            System.out.println("-----");
                            student.showInfo();
                            System.out.println("-----");
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Nhập vào mã sinh viên: ");
                    String id = sc.nextLine();
                    boolean check = false;
                    for (Student student : students) {
                        if (student.getId().equals(id)) {
                            student.showInfo();
                            check = true;
                            break;
                        }
                    }
                    if (!check) {
                        System.out.println("Không có sinh viên có mã sinh viên là : " + id);
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
                        student.showInfo();
                    }
                }
                case 6 -> {
                    ArrayList<Student> scholarshipList = new ArrayList<>();
                    for (Student student : students) {
                        if (student.scholarshipCheck()) {
                            scholarshipList.add(student);
                        }
                        Collections.sort(scholarshipList, new Comparator<Student>() {
                            @Override
                            public int compare(Student o1, Student o2) {
                                return (int) (o2.getAverageScore() * 100 - o1.getAverageScore() * 100);
                            }
                        });
                    }
                    for (Student student : scholarshipList) {
                        student.showInfo();
                    }
                }
                default -> {
                    return;
                }
            }
        }
    }
}
