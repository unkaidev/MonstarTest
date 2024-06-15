package main.java.test3.BTAbstractInterface.NewsManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<News> arrayListNews = new ArrayList<>();
        while (true) {
            showMenu();
            int select = scanner.nextInt();
            scanner.nextLine();
            switch (select) {
                case 1 ->
                {
                    News news = addNews(scanner);
                    for (int i = 0; i < news.rateList.length; i++) {
                        System.out.println("Nhập vào số rate " + i);
                        int rate = scanner.nextInt();
                        news.rateList[i] = rate;
                    }
                    arrayListNews.add(news);
                }
                case 2 ->
                {
                    System.out.println("2. View list news ");
                    for (News news: arrayListNews
                         ) {
                        System.out.println("---");
                        news.display();
                        System.out.println("---");
                    }
                }

                case 3 ->
                {
                    System.out.println("3. Average rate");
                    for (News news: arrayListNews
                         ) {
                        news.calculate();
                        news.display();
                    }
                }

                case 4 ->
                {
                    System.out.println("4. Exit");
                    return;
                }
            }
        }
    }
    public static void showMenu(){
        System.out.println("------");
        System.out.println("----MENU----");
        System.out.println("----CHỌN CHỨC NĂNG----");
        System.out.println("1. Insert news");
        System.out.println("2. View list news");
        System.out.println("3. Average rate");
        System.out.println("4. Exit");
        System.out.println("---");
    }
    public static News addNews(Scanner scanner){
        System.out.println("1. Insert news ");
        System.out.println();
        System.out.println("Nhập vào title: ");
        String title = scanner.nextLine();
        System.out.println("Nhập vào publish date: ");
        String publishDate = scanner.nextLine();
        System.out.println("Nhập vào author: ");
        String author = scanner.nextLine();
        System.out.println("Nhập vào content: ");
        String content = scanner.nextLine();
        return new News(title,publishDate,author,content);
    }
}
