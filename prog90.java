//Write a program to Find first repeating character.

import java.util.Scanner;


public class prog90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();
        
        char firstRepeatingChar = findFirstRepeatingCharacter(inputString);
        
        if (firstRepeatingChar != '\0') {
            System.out.println("First repeating character: " + firstRepeatingChar);
        } else {
            System.out.println("No repeating character found.");
        }
    }
    
    static char findFirstRepeatingCharacter(String str) {
        int[] charCount = new int[256]; 
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }
        for (char c : str.toCharArray()) {
            if (charCount[c] > 1) {
                return c;
            }
        }
        return 0; 
    }
    
}
