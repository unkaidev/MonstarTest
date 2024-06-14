package main.java.test1.ex1;

import java.util.Scanner;

public class CalDelta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a,b,c của Phương trình bậc 2: ax2+bx+c=0 ");
        System.out.println("Nhập vào a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập vào c: ");
        int c = scanner.nextInt();
        double delta = b * b - 4 * a * c;
        if (a == 0) {
            System.out.println("Điều kiện a khác 0");
        } else {
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = (double) -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có nghiệm x1 = " + x1 + " x2 = " + x2);
            }
        }
    }
}