package main.java.test3.BTCoBan.BTMang;

import java.util.Scanner;

public class Phan3Bai13 extends Phan3Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = nhapMang(sc);
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Phần tử có giá trị nhỏ nhất là : " + min);
    }
}
