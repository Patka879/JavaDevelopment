package org.example.advancedDevelopment.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private Map<String, List<String>> storage;

    public Storage() {
        this.storage = new HashMap<>();
    }

    public void addToStorage(String key, String value) {
        List<String> values = storage.get(key);
        if (values == null) {
            values = new ArrayList<>();
        }
        values.add(value);
        storage.put(key, values);
    }

    public void printValues(String key) {
        List<String> values = storage.get(key);
        if (values == null) {
            System.out.println("No values for this key");
        } else {
            values.forEach(System.out::println);
        }
    }


    public void findValues(String value) {
        for (Map.Entry<String, List<String>> entry : storage.entrySet()) {
            if (entry.getValue().contains(value)) {
                System.out.println(entry.getKey());
            }
        }
    }

    @Override
    public String toString() {
        return "Storage{" +
                "storage=" + storage +
                '}';
    }
}

