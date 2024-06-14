package main.java.test3.BTCoBan.BTVongLap;

import main.java.test3.BTCoBan.BTDieuKien.Phan1Bai5;

import java.util.Scanner;

public class Phan2Bai10 extends Phan1Bai5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "B170[1-9]{4}";
        int i = 1;
        while (i <= 5) {
            System.out.println("Nhập vào mã sinh viên " + i + " : ");
            String maSV = sc.nextLine();
            if (kiemTraDinhDang(maSV, regex)) {
                i++;
            } else {
                System.out.println("Sai định dạng, mời nhập lại !");
            }
        }
    }
}
