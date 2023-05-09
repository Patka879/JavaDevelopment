package org.example.advancedDevelopment.task3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create a class called Storage that has a private field of type Map, a public constructor, and the following methods:
 *
 * addToStorage(String key, String value): adds elements to the storage.
 * printValues(String key): displays all elements under a given key.
 * findValues(String value): displays all keys that have the given value.
 *
 * The Storage class should allow for storing multiple values under one key.
 */
public class StorageDemo {
    public static void main(String[] args) {
        Storage storage = new Storage();

        storage.addToStorage("10", "Dog");
        System.out.println(storage);

    }
}
