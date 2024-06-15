package main.java.test3.BTKeThua.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestZoo {
    private static Zoo zoo = new Zoo();

    public static void showMenu() {
        System.out.println("-------");
        System.out.println("1. Thêm chuồng");
        System.out.println("2. Xóa chuồng");
        System.out.println("3. Thêm con vật");
        System.out.println("4. Xóa con vật");
        System.out.println("5. Xem tất cả con vật");
        System.out.println("6. Thoát");
        System.out.println("Mời lựa chọn: ");
    }

    public static void addAnimalToCage(int cageId, Animal animal) {
        try {
            for (Cage cage : zoo.getCageList()) {
                if (cageId == cage.getId()) {
                    cage.addAnimal(animal);
                }
            }
        } catch (Exception e) {
            System.out.println("Chưa có chuồng nào trong sở thú");
        }
    }

    public static void removeAnimalToCage(String name) {
        try {
            for (Cage cage : zoo.getCageList()) {
                cage.removeAnimal(name);
            }
        } catch (Exception e) {
            System.out.println("Chưa có chuồng nào trong sở thú");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            showMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.println("Nhập vào id của chuồng: ");
                    int id = sc.nextInt();
                    Cage newCage = new Cage(id);
                    zoo.addCage(newCage);
                    System.out.println("Thêm chuồng id " + id + " thành công");
                }
                case 2 -> {
                    System.out.println("Nhập vào id của chuồng: ");
                    int id = sc.nextInt();
                    zoo.removeCage(id);
                    System.out.println("Xóa chuồng id " + id + " thành công");
                }
                case 3 -> {
                    System.out.println("Nhập vào loại con vật muốn thêm: 1.Tiger - 2.Dog - 3.Cat ");
                    int select = sc.nextInt();
                    sc.nextLine();
                    Animal animal = inputAnimalInfo(sc, select);
                    if (animal != null) {
                        System.out.println("Nhập vào id chuồng muốn thêm động vật : ");
                        int id = sc.nextInt();
                        addAnimalToCage(id, animal);
                    } else {
                        System.out.println("Lựa chọn không hợp lệ! ");
                    }
                }
                case 4 -> {
                    System.out.println("Nhập vào tên con vật : ");
                    String name = sc.nextLine();
                    removeAnimalToCage(name);
                    System.out.println("Xóa con vật thành công!");
                }
                case 5 -> {
                    try {
                        for (Cage cage : zoo.getCageList()) {
                            ArrayList<Animal> animalArrayList = cage.getAnimalList();
                            for (Animal animal : animalArrayList) {
                                animal.viewInfo();
                                animal.voice();
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Chưa có chuồng hoặc động vật");
                    }
                }
                default -> {
                    return;
                }
            }
        }
    }

    private static Animal inputAnimalInfo(Scanner sc, int select) {
        System.out.println("Tên: ");
        String name = sc.nextLine();
        System.out.println("Tuổi: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Mô tả: ");
        String description = sc.nextLine();
        return switch (select) {
            case 1 -> new Tiger(name, age, description);
            case 2 -> new Dog(name, age, description);
            case 3 -> new Cat(name, age, description);
            default -> null;
        };
    }
}
