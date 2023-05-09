package org.example.advancedDevelopment.task1;

import java.util.ArrayList;
import java.util.Collections;
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

        Collections.sort(names, Collections.reverseOrder()); // one method, predefined
        System.out.println(names);
        System.out.println(sortStrings(names));
    }

    public static List<String> sortStrings(List<String> names) { //second method
        return names.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
    }
}





