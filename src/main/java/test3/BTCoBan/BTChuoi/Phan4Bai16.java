package main.java.test3.BTCoBan.BTChuoi;

import java.util.Scanner;

public class Phan4Bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = NhapChuoi.nhapChuoi(sc);
        System.out.println("Nhập vào 1 ký tự: ");
        char c = sc.next().charAt(0);
        boolean check = true;
        for (int i = 0; i < s.length(); i++) {
            check = s.charAt(i) == c;
            if(check){
                break;
            }
        }
        if (check) {
            System.out.println("Có");
        }else
            System.out.println("Không");
    }
}
