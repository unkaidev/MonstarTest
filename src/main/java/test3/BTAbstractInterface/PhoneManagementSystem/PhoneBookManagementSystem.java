package main.java.test3.BTAbstractInterface.PhoneManagementSystem;

import java.util.Scanner;

public class PhoneBookManagementSystem {

    private static void showMenu() {
        System.out.println("-----------");
        System.out.println("1. Add Phone");
        System.out.println("2. Remove Phone");
        System.out.println("3. Update Phone");
        System.out.println("4. Search Phone");
        System.out.println("5. Sort Phone");
        System.out.println("6. Exit");
        System.out.println("Enter your choice: ");
        System.out.println("------------");
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner sc = new Scanner(System.in);
        while (true) {
            showMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone: ");
                    String phone = sc.nextLine();
                    phoneBook.insertPhone(name, phone);
                }
                case 2 -> {
                    System.out.print("Enter name to remove: ");
                    String name = sc.nextLine();
                    phoneBook.removePhone(name);
                }
                case 3 -> {
                    System.out.print("Enter name to update: ");
                    String name = sc.nextLine();
                    System.out.print("Enter new phone: ");
                    String newPhone = sc.nextLine();
                    phoneBook.updatePhone(name, newPhone);
                }
                case 4 -> {
                    System.out.print("Enter name to search: ");
                    String name = sc.nextLine();
                    phoneBook.searchPhone(name);
                }
                case 5 -> {
                    phoneBook.sort();
                    phoneBook.printPhoneList();
                }
                case 6 -> {
                    return;
                }
                case 7 -> phoneBook.printPhoneList();
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }
}
