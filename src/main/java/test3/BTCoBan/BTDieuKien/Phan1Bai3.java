package main.java.test3.BTCoBan.BTDieuKien;

import java.util.Scanner;

public class Phan1Bai3 {

    public static double[] nhapData(Scanner sc) {
        System.out.println("Nhập vào 3 số thực a, b, c :");
        System.out.println("Nhập vào số a : ");
        double a = sc.nextDouble();
        System.out.println("Nhập vào số b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập vào số c: ");
        double c = sc.nextDouble();
        double[] vao = new double[3];
        vao[0] = a;
        vao[1] = b;
        vao[2] = c;
        return vao;
    }

    public static boolean kiemTraTamGiac(double[] data) {
        return (data[0] + data[1] > data[2])
                && (data[0] + data[2] > data[1])
                && (data[1] + data[2] > data[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] data;
        data = nhapData(sc);
        if (kiemTraTamGiac(data)) {
            System.out.println("a,b,c là 3 cạnh của 1 tam giác!");
        } else {
            System.out.println("a,b,c không là 3 cạnh của 1 tam giác!");
        }
    }
}
