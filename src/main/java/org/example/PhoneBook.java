package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {
    public static HashMap<String, Long> phoneBook = new HashMap<>();

    public static int add(String name, long number) {
        phoneBook.put(name, number);
        return phoneBook.size();
    }
    public static String findByNumber(long number) {
        return null;
    }
}
