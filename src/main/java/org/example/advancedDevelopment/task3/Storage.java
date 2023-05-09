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
            for (Map.Entry<String, List<String>> entry : storage.entrySet()) {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }
        }
    }


    public void findValues(String value) {
        List<String> keys = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : storage.entrySet()) {
            if (entry.getValue().contains(value)) {
                keys.add(entry.getKey());
            }
        }
        System.out.println("Value " + value + " Keys:");
        for (String key : keys) {
            System.out.println(key);
        }
    }

    @Override
    public String toString() {
        return "Storage{" +
                "storage=" + storage +
                '}';
    }
}

