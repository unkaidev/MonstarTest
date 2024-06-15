package main.java.test3.BTKeThua.Bai2;

import java.util.Scanner;

public class Dog extends Animal {
    @Override
    public void voice() {
        super.voice();
        System.out.println("Dog voice");
    }

    public Dog() {
    }

    public Dog(String name, int age, String description) {
        super(name, age, description);
    }
}
