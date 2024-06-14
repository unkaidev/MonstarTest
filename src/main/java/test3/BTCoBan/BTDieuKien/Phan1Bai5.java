package main.java.test3.BTCoBan.BTDieuKien;

import java.util.Scanner;

public class Phan1Bai5 {

    public static boolean kiemTraDinhDang(String s, String regex) {
        return s.matches(regex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mã số sinh viên: ");
        String maSV = sc.nextLine();
        String regex = "B[1-9]{7}";
        if (kiemTraDinhDang(maSV,regex)) {
            System.out.println("Mã đúng định dạng!");
        } else {
            System.out.println("Mã sai định dạng!");
        }
    }
}
