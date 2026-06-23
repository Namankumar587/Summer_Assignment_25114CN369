//Write a program to Sort words by length.

import java.util.Arrays;
import java.util.Comparator;

public class prog100 {
    public static void main(String[] args) {
        String[] words = {"apple", "pie", "banana", "cat", "elephant"};
        System.out.println("Original array: " + Arrays.toString(words));

        Arrays.sort(words, Comparator.comparing(String::length));
        System.out.println("Sorted by length: " + Arrays.toString(words));
    }
}




















