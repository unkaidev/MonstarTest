package main.java.test1.ex2;

import java.util.Scanner;

public class CalElectFee {
    static int UNIT_PRICE_0_25 = 1000;
    static int UNIT_PRICE_26_75 = 1250;
    static int UNIT_PRICE_76_150 = 1800;
    static int UNIT_PRICE_OVER_150 = 2500;

    public static int[] calSum(int num) {
        int[] sum = new int[4];
        if (num > 0 && num <= 25) {
            sum[0] = num * UNIT_PRICE_0_25;
            sum[1] = 0;
            sum[2] = 0;
            sum[3] = 0;
        } else if (num > 25 && num <= 75) {
            sum[0] = 25 * UNIT_PRICE_0_25;
            sum[1] = (num - 25) * UNIT_PRICE_26_75;
            sum[2] = 0;
            sum[3] = 0;
        } else if (num > 75 && num <= 150) {
            sum[0] = 25 * UNIT_PRICE_0_25;
            sum[1] = 50 * UNIT_PRICE_26_75;
            sum[2] = (num - 75) * UNIT_PRICE_76_150;
            sum[3] = 0;
        } else if(num > 150) {
            sum[0] = 25 * UNIT_PRICE_0_25;
            sum[1] = 50 * UNIT_PRICE_26_75;
            sum[2] = 75 * UNIT_PRICE_76_150;
            sum[3] = (num - 150) * UNIT_PRICE_OVER_150;
        }
        return sum;
    }

    public static void printTotal(int[] sum) {
        int sumTotal = 0;
        for (int i = 0; i < sum.length; i++) {
            System.out.println("Số điện mức " + i + " của bạn: " + sum[i]);
            sumTotal += sum[i];
        }
        System.out.println("------");
        System.out.println("Tổng số tiền = " + sumTotal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số điện của gia đình bạn trong 1 tháng:");
        int num = scanner.nextInt();
        System.out.println("Số điện của gia đình bạn là: " + num);
        int[] sum = calSum(num);
        printTotal(sum);
    }
}
