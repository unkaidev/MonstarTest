package main.java.test3.BTHuongDoiTuong.Bai01;

import java.util.Scanner;

public class TestPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tử số phân số thứ nhất : ");
        int a = sc.nextInt();
        System.out.println("Nhập vào mẫu số khác 0, phân số thứ nhất : ");
        int b = sc.nextInt();
        System.out.println("Nhập vào tử số phân số thứ hai : ");
        int c = sc.nextInt();
        System.out.println("Nhập vào mẫu số khác 0, phân số thứ hai : ");
        int d = sc.nextInt();
        PhanSo phanSo1 = new PhanSo(a,b);
        PhanSo phanSo2 = new PhanSo(c,d);
        System.out.println("Phân số 1: "+ phanSo1);
        System.out.println("Phân số 2: "+ phanSo2);
        phanSo1.congPhanSo(phanSo2);
        phanSo1.truPhanSo(phanSo2);
        phanSo1.nhanPhanSo(phanSo2);
        phanSo1.chiaPhanSo(phanSo2);
    }
}
