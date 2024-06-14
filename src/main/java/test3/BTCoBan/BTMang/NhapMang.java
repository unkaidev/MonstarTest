package main.java.test3.BTCoBan.BTMang;

import java.util.Scanner;

public interface NhapMang {
    static String[] nhapMang(Scanner sc) {
        System.out.println("Nhập vào số phần tử của mảng n : ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào phần tử số " + i);
            arr[i] = sc.nextLine();
        }
        return arr;
    }
}
