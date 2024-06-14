package main.java.test3.BTCoBan.BTMang;

import java.util.Scanner;

public class Phan3Bai11 {
    public static int[] nhapMang(Scanner sc) {
        System.out.println("Nhập vào số phần tử của mảng n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào phần tử số " + i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = nhapMang(sc);
        long sum = 0;
        for (int j : arr) {
            sum += j;
        }
        double avg = (double) sum / arr.length;
        System.out.println("Trung bình cộng các phần tử trong mảng : " + avg);
    }
}
