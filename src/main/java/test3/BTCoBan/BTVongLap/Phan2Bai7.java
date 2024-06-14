package main.java.test3.BTCoBan.BTVongLap;

import java.util.Scanner;

public class Phan2Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên dương n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 20; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
