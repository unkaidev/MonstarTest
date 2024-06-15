package main.java.test3.BTAbstractInterface.NewsManagementSystem;

public class News implements INews {
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;

    public News(String title, String publishDate, String author, String content) {
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
    }

    public News(String title, String publishDate, String author, String content, int[] rateList) {
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.rateList = rateList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }


    @Override
    public void display() {
        System.out.println("----");
        System.out.println("Title: " + title);
        System.out.println("Publish Date: " + publishDate);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
        System.out.println("AverageRate: " + averageRate);
        System.out.println("----");
    }

    int[] rateList = new int[3];

    public void calculate() {
        this.averageRate = (float) (rateList[0] + rateList[1] + rateList[2]) / 3;
    }

}
