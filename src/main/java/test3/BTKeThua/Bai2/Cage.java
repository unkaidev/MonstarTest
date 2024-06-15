package main.java.test3.BTKeThua.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Cage {
    private int id;
    private ArrayList<Animal> animalList = new ArrayList<>();

    public Cage() {
    }

    public Cage(int id) {
        this.id = id;
    }

    public Cage(ArrayList<Animal> animalList) {
        this.animalList = animalList;
    }

    public Cage(int id, ArrayList<Animal> animalList) {
        this.id = id;
        this.animalList = animalList;
    }

    public void addAnimal(Animal a) {
        animalList.add(a);
    }
    public void removeAnimal(String name) {
        animalList.removeIf(a -> a.getName().equals(name));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(ArrayList<Animal> animalList) {
        this.animalList = animalList;
    }
}
