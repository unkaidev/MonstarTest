package main.java.test3.BTKeThua.Bai2;

public abstract class Animal {
    private String name;
    private int age;
    private String description;

    public void viewInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Description: " + description);
    }

    public void voice() {
    }

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Animal(String name, int age, String description) {
        this.name = name;
        this.age = age;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
