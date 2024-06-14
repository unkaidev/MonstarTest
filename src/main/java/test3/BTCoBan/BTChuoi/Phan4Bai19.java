package main.java.test3.BTCoBan.BTChuoi;

import java.util.Scanner;

public class Phan4Bai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = NhapChuoi.nhapChuoi(sc);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("Ký tự a xuất hiện: "+count+" lần");
    }
}
