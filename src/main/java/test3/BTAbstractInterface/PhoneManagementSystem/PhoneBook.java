package main.java.test3.BTAbstractInterface.PhoneManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PhoneBook extends Phone {
    private ArrayList<PhoneEntry> phoneList = new ArrayList<>();

    private class PhoneEntry {
        private String name;
        private List<String> phones;

        public PhoneEntry(String name, String phone) {
            this.name = name;
            this.phones = new ArrayList<>();
            this.phones.add(phone);
        }

        public String getName() {
            return name;
        }

        public List<String> getPhones() {
            return phones;
        }

        public void addPhone(String phone) {
            if (!phones.contains(phone)) {
                phones.add(phone);
            }
        }

        public void setPhones(List<String> phones) {
            this.phones = phones;
        }

        @Override
        public String toString() {
            return name + ": " + String.join(" : ", phones);
        }
    }

    String regexPhone = "^0\\d{9}";

    @Override
    public void insertPhone(String name, String phone) {
        if (phone.matches(regexPhone)) {
            for (PhoneEntry entry : phoneList) {
                if (entry.getName().equals(name)) {
                    if (!entry.getPhones().contains(phone)) {
                        entry.addPhone(phone);
                        System.out.println("Add phone " + phone + " successfully");
                    }
                    return;
                }
            }
            phoneList.add(new PhoneEntry(name, phone));
            System.out.println("Insert Phone Entry " + name + " successfully");
        } else {
            System.out.println("Phone number " + phone + " is not valid ");
        }
    }

    @Override
    public void removePhone(String name) {
        phoneList.removeIf(entry -> entry.getName().equals(name));
        System.out.println("Remove Phone Entry " + name + " successfully");
    }

    @Override
    public void updatePhone(String name, String newPhone) {
        if (newPhone.matches(regexPhone)) {
            for (PhoneEntry entry : phoneList) {
                if (entry.getName().equals(name)) {
                    entry.setPhones(new ArrayList<>(List.of(newPhone)));
                    System.out.println("Update Phone Entry " + name + " successfully");
                    return;
                } else {
                    System.out.println("Phone Entry Not Found ");
                }
            }
        } else {
            System.out.println("Phone number " + newPhone + " is not valid ");
        }
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneEntry entry : phoneList) {
            if (entry.getName().equals(name)) {
                System.out.println(entry);
                return;
            }
        }
        System.out.println("Entry not found");
    }

    @Override
    public void sort() {
        //ASC
        Collections.sort(phoneList, Comparator.comparing(PhoneEntry::getName));
        //DESC
//        Collections.sort(phoneList, Comparator.comparing(PhoneEntry::getName).reversed());
    }

    public void printPhoneList() {
        for (PhoneEntry entry : phoneList) {
            System.out.println(entry);
        }
    }
}
