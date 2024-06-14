package main.java.test3.BTCoBan.BTVongLap;

import java.util.Scanner;

public class Phan2Bai9 {
    public static int fibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;
        return (fibonacci(n - 1) + fibonacci(n - 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số n <= 20 : ");
        int n = sc.nextInt();
        System.out.println("Số Fibonacci ứng với nó là " + fibonacci(n));
    }
}
