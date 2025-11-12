package ru.netology;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

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

    public String findByNumber(String phoneNum) {
        Optional<String> getName = phoneBook.entrySet().stream()
                .filter(n -> n.getValue().equals(phoneNum))
                .map(Map.Entry::getKey)
                .findFirst();
        return getName.orElse("");
    }

    public String findByName(String contactName) {
        return phoneBook.get(contactName);
    }

    public String printAllNames() {
        String s;
        Map<String, String> sortedMap = new TreeMap<>(phoneBook);
        s = sortedMap.keySet().toString();
        return s;
    }

}
