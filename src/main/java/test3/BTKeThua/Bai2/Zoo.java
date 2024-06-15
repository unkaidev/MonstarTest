package main.java.test3.BTKeThua.Bai2;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Cage> cageList = new ArrayList<>();

    public Zoo() {
    }

    public Zoo(ArrayList<Cage> cageList) {
    }

    public ArrayList<Cage> getCageList() {
        return cageList;
    }

    public void setCageList(ArrayList<Cage> cageList) {
        this.cageList = cageList;
    }

    public void addCage(Cage cage) {
        cageList.add(cage);
    }

    public void removeCage(int cageId) {
        cageList.removeIf(cage -> cage.getId() == cageId);
    }
}
