package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, String> phoneBook = new HashMap<>();

    private static PhoneBook INSTANCE;

    private PhoneBook() {
    }

    public static PhoneBook getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PhoneBook();
        }
        return INSTANCE;
    }

    public int add(String name, String phoneNum) {
        phoneBook.put(name, phoneNum);
        return phoneBook.size();
    }

}
