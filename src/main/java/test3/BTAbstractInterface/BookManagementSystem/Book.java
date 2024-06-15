package main.java.test3.BTAbstractInterface.BookManagementSystem;

import java.util.Scanner;

public class Book implements IBook {
    private int id;
    private String name;
    private String publishDate;
    private String author;
    private String language;
    private double averagePrice;
    private static int nextId = 1;
    public Book() {
    }

    public Book(String name, String publishDate, String author, String language) {
        this.id = nextId;
        nextId++;
        this.name = name;
        this.publishDate = publishDate;
        this.author = author;
        this.language = language;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    @Override
    public void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("PublishDate : " + publishDate);
        System.out.println("Author : " + author);
        System.out.println("Language : " + language);
        System.out.println("Average Price : " + averagePrice);
    }

    int[] priceList = new int[5];

    public void averagePrice() {
        int sum = 0;
        for (int i = 0; i < priceList.length; i++) {
            sum += priceList[i];
        }
        this.averagePrice = sum / 5;
    }

}
