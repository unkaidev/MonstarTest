package main.java.test1.ex3;

import java.util.Scanner;

public class Square {
    private float e;

    public Square(float e) {
        this.e = e;
    }

    // show edge length
    public void showEdgeLength() {
        System.out.println("Chiều dài cạnh hình vuông là:" + this.e);
    }

    // cal and show perimeter
    public void calAndShowPeri() {
        float peri = this.e * 2;
        System.out.println("Chu vi của hình vuông là: " + peri);
    }

    // cal and show acreage
    public void calAndShowAcreage() {
        float acr = this.e * this.e;
        System.out.println("Diện tích của hình vuông là: " + acr);
    }
    public void showAll(){
        this.showEdgeLength();
        this.calAndShowPeri();
        this.calAndShowAcreage();
    }

    public static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào cạnh của hình vuông: ");
            float e = scanner.nextFloat();
            Square square = new Square(e);
            System.out.println("Phương thức show độ dài cạnh");
            System.out.println("---");
            square.showEdgeLength();
            System.out.println("---");

            System.out.println("Phương thức tính và show chu vi");
            System.out.println("---");

            square.calAndShowPeri();
            System.out.println("---");

            System.out.println("Phương thức tính và show diện tích");
            System.out.println("---");

            square.calAndShowAcreage();
            System.out.println("---");

            System.out.println("Phương thức show all");
            System.out.println("---");

            square.showAll();
        }
    }
}
