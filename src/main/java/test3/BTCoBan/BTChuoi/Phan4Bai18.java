package main.java.test3.BTCoBan.BTChuoi;

import main.java.test3.BTCoBan.BTDieuKien.KiemTraDinhDang;

import java.util.Scanner;

public class Phan4Bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = NhapChuoi.nhapChuoi(sc);
        String regex = "[0-9]";
        boolean check = true;
        for (int i = 0; i < s.length(); i++) {
            check = KiemTraDinhDang.kiemTraDinhDang(String.valueOf(s.charAt(i)), regex);
            if (check) {
                break;
            }
        }
        if (check) {
            System.out.println("Có");
        } else
            System.out.println("Không");
    }
}
