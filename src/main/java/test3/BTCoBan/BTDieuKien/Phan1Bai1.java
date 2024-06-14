package main.java.test3.BTCoBan.BTDieuKien;

import java.util.Scanner;

public class Phan1Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên: ");
        int num = sc.nextInt();
        if(num>=0){
            System.out.println("Đây là số nguyên dương ! ");
        }else {
            System.out.println("Đây là số nguyên âm ! ");
        }
    }
}