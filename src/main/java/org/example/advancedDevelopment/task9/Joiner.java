package org.example.advancedDevelopment.task9;

/**
 * Design a Joiner class that takes a separator (string) in the constructor and has a join() method that
 * allows any number of objects of type T to be passed as arguments. This method will return a string by
 * joining all the passed elements by calling their toString() method and separating them with the separator.
 * For example, for Integers and a separator of "-", it should return: "1-2-3-4...".
 */
public class Joiner <T>{
    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... things) {
        String joined = "";
        for (int i = 0; i < things.length; i++) {
            joined += (things[i].toString());
            if (i < things.length - 1) {
                joined += separator;
            }
        }
        return joined;
    }
}
