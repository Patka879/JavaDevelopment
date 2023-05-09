package org.example.advancedDevelopment.task1.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a method that takes a list of strings as a parameter, and then returns that
 * list sorted alphabetically from Z to A without considering letter case.
 */
public class IgnoreCaseSort {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Iza");
        names.add("Adam");
        names.add("ada");
        names.add("daniel");
        names.add("Przemek");

        System.out.println(ignoreCaseSorting(names));


    }

    public static List<String> ignoreCaseSorting(List<String> names) { //second method
        return names.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                .toList();
    }

}
