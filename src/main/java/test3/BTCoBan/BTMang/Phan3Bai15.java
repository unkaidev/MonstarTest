package main.java.test3.BTCoBan.BTMang;

import java.util.Scanner;

public class Phan3Bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = NhapMang.nhapMang(sc);
        String regex = "00[2-5]L[0-9]{4}";
        boolean check = true;
        for(String s : arr){
            check = s.matches(regex);
            if(!check){
                break;
            }
        }
        if(check){
            System.out.println("Đúng rồi");
        }else {
            System.out.println("Sai rồi");
        }
    }
}
