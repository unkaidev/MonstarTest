package main.java.test3.BTKeThua.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Tiger extends Animal {
    public Tiger(String name, String s, String description) {
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Tiger voice");
    }

    public Tiger() {
    }

    public Tiger(String name, int age, String description) {
        super(name, age, description);
    }
}
