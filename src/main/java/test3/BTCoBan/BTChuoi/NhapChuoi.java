package main.java.test3.BTCoBan.BTChuoi;

import java.util.Scanner;

public interface NhapChuoi {
    static String nhapChuoi(Scanner sc){
        System.out.println("Nhập vào một chuỗi : ");
        return sc.nextLine();
    }
}
