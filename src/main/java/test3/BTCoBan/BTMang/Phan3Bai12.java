package main.java.test3.BTCoBan.BTMang;

import java.util.Scanner;

public class Phan3Bai12 extends Phan3Bai11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = nhapMang(sc);
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Phần tử có giá trị lớn nhất là : " + max);
    }
}
