package main.java.test3.BTAbstractInterface.BookManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static void showMenu() {
        System.out.println("------");
        System.out.println("1. Insert new book");
        System.out.println("2. View list of books");
        System.out.println("3. Average price");
        System.out.println("4. Exit");
        System.out.println("Choose an option: ");
        System.out.println("------");
    }

    public static Book insertBook(Scanner sc) {
        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        System.out.println("Enter PublishDate : ");
        String publishDate = sc.nextLine();
        System.out.println("Enter Author : ");
        String author = sc.nextLine();
        System.out.println("Enter Language : ");
        String language = sc.nextLine();
        return new Book(name, publishDate, author, language);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            showMenu();
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    Book newBook = insertBook(sc);
                    for (int i = 0; i < newBook.priceList.length; i++) {
                        System.out.println("Price " + (i+1) + ":");
                        int price = sc.nextInt();
                        newBook.priceList[i] = price;
                    }
                    books.add(newBook);
                    break;
                case 2:
                    for (Book book : books) {
                        System.out.println("----");
                        book.display();
                        System.out.println("----");
                    }
                    break;
                case 3:
                    for (Book book : books) {
                        book.averagePrice();
                        System.out.println("----");
                        book.display();
                        System.out.println("----");
                    }
                    break;
                default:
                    return;
            }
        }
    }
}
