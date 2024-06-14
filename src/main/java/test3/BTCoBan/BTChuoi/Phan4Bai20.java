package main.java.test3.BTCoBan.BTChuoi;

import main.java.test3.BTCoBan.BTDieuKien.KiemTraDinhDang;

import java.util.Scanner;

public class Phan4Bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = NhapChuoi.nhapChuoi(sc);
        String regex = "^[A-Z][a-zA-Z0-9]{0,18}[0-9]$";
        if(KiemTraDinhDang.kiemTraDinhDang(s,regex)){
            System.out.println("Duyệt");
        }else {
            System.out.println("Không duyệt");
        }
    }
}
