package main.java.test3.BTKeThua.Bai2;

import java.util.Scanner;

public class Cat extends Animal {
    @Override
    public void voice() {
        super.voice();
        System.out.println("Cat voice");
    }

    public Cat() {
    }

    public Cat(String name, int age, String description) {
        super(name, age, description);
    }
}
