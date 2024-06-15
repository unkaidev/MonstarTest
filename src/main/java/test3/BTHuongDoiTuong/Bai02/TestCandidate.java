package main.java.test3.BTHuongDoiTuong.Bai02;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCandidate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng thí sinh : ");
        int n = sc.nextInt();
        ArrayList<Candidate> candidates = new ArrayList<Candidate>();
        for (int i = 0; i < n; i++) {
            Candidate candidate = new Candidate();
            candidate.inputInfo();
            candidates.add(candidate);
        }
        for (Candidate candidate : candidates) {
            if (candidate.getMath() + candidate.getLiterature() + candidate.getEnglish() >= 10) {
                candidate.printInfo();
            }
        }
    }
}
