package org.example.advancedDevelopment.task9;

public class JoinerDemo {
    public static void main(String[] args) {
        Joiner joiner = new Joiner("-");
        System.out.println(joiner.join("dog", "cat", "dog"));
    }
}
