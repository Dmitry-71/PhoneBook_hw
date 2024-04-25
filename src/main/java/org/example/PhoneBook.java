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
        Optional<String> result = phoneBook.entrySet().stream()
                .filter(n -> n.getValue().equals(number))
                .map(Map.Entry::getKey)
                .findFirst();

        return result.orElse("");
    }

    public static long findByName(String name) {
        return 0;
    }
}
