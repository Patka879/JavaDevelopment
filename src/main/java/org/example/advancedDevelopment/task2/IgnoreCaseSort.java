package org.example.advancedDevelopment.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        Comparator<String> comparator = (s1, s2) -> s2.compareToIgnoreCase(s1);

        List<String> list = (new ArrayList<String>(List.of("A","c","b","E","F")));
        Collections.sort(list, comparator);
        System.out.println(list);


    }

    public static List<String> ignoreCaseSorting(List<String> names) { //second method
        return names.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                .toList();
    }

}
