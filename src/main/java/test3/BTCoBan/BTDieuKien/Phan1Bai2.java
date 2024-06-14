package main.java.test3.BTCoBan.BTDieuKien;

import java.util.Scanner;

public class Phan1Bai2 {
    public static String numberToWords(int n) {
        return switch (n) {
            case 0 -> "Không";
            case 1 -> "Một";
            case 2 -> "Hai";
            case 3 -> "Ba";
            case 4 -> "Bốn";
            case 5 -> "Năm";
            case 6 -> "Sáu";
            case 7 -> "Bảy";
            case 8 -> "Tám";
            case 9 -> "Chín";
            default -> "Chưa hỗ trợ";
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên từ 0 đến 9: ");
        int n = sc.nextInt();
        if (n < 0 || n > 9) {
            System.out.println("Số ngoài phạm vi hỗ trợ.");
        } else {
            System.out.println("Số " + n + " dưới dạng chữ là: " + numberToWords(n));
        }
    }
}
