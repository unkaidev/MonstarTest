package main.java.test3.BTCoBan.BTVongLap;

import java.util.Scanner;

public class Phan2Bai8 {
    public static boolean kiemTraSoNguyenTo(int n){
        if (n<2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên n < 1000 : ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if (kiemTraSoNguyenTo(i)) {
                System.out.println(i);
            }
        }
    }
}
