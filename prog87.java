//Write a program to Character frequency.

import java.util.Scanner;

public class prog87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();
        
        int[] frequency = new int[256]; 
        
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            frequency[c]++;
        }
        
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) i + ": " + frequency[i]);
            }
        }
    }
}