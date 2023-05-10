package org.example.advancedDevelopment.task10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Predicate;

/**
 * Implement a generic method called partOf that takes an array of any type and a function as
 * parameters and returns the percentage of elements that satisfy the condition.
 */
public class Task10 {

    public static void main(String[] args) {
        Task10 demo = new Task10();
        System.out.println(demo.partOf(new Integer[] {1,2,3,4}, a -> a % 2 == 0));
    }

    public <T> long partOf(T[] arr, Predicate<T> predicate) {

        long num = Arrays.stream(arr)
                    .filter(predicate)
                    .count();

//        int countOfPassedElements = 0;
//        for (T element : arr) {
//            if (predicate.test(element)) {
//                countOfPassedElements++;
//            }
//        }

        return (num * 100) / arr.length;

    }
}
