package main.java.test3.BTCoBan.BTDieuKien;

import java.util.Scanner;

public class Phan1Bai4 extends Phan1Bai3 {
    public static boolean kiemTraTamGiacVuong(double[] data) {
        double a = data[0];
        double b = data[1];
        double c = data[2];
        return a * a + b * b == c * c
                || a * a + c * c == b * b
                || b * b + c * c == a * a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] data;
        data = nhapData(sc);
        if (kiemTraTamGiac(data)) {
            if (kiemTraTamGiacVuong(data)) {
                System.out.println("a,b,c là 3 cạnh của tam giác vuông");
            } else {
                System.out.println("a,b,c không phải 3 cạnh của tam giác vuông!");
            }
        } else {
            System.out.println("a,b,c không phải 3 cạnh của tam giác");
        }
    }
}
