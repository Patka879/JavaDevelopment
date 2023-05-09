package org.example.advancedDevelopment.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListOfStrings {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Iza");
        names.add("Adam");
        names.add("Ada");
        names.add("Daniel");
        names.add("Przemek");

        System.out.println(sortStrings(names));
    }

    public static List<String> sortStrings(List<String> names) {
        return names.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
    }
}





