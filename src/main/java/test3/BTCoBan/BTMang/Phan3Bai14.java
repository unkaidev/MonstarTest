package main.java.test3.BTCoBan.BTMang;

import java.util.Arrays;
import java.util.Scanner;

public class Phan3Bai14 extends Phan3Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = nhapMang(sc);
        System.out.println(Arrays.toString(arr));
        int[] arrReverse = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrReverse[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(arrReverse));
    }
}
