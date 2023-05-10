package org.example.advancedDevelopment.task9;

/**
 * Design a Joiner class that takes a separator (string) in the constructor and has a join() method that
 * allows any number of objects of type T to be passed as arguments. This method will return a string by
 * joining all the passed elements by calling their toString() method and separating them with the separator.
 * For example, for Integers and a separator of "-", it should return: "1-2-3-4...".
 *
 * Add 2 additional classes, JoinerString and JoinerInteger, that inherit from Joiner.
 * The new classes must implement the same logic as the base class but return the results in the following format:
 * - JoinerInteger, assuming joiner is ",": "{0,1,2,3,4,5}"
 * - JoinerString, assuming joiner is "-": "[0:text1-1:text2-2:text3]"
 */

public abstract class Joiner <T>{
    protected String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public abstract String join(T... things);
}
