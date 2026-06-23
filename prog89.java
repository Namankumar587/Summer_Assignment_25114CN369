//Write a program to Find first non-repeating character.

import java.util.Scanner;

public class prog89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();
        
        char firstNonRepeatingChar = findFirstNonRepeatingCharacter(inputString);
        
        if (firstNonRepeatingChar != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
        static char findFirstNonRepeatingCharacter(String str) {
        int[] charCount = new int[256]; 
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }
        for (char c : str.toCharArray()) {
            if (charCount[c] == 1) {
                return c;
            }
        }
        return '\0'; 
    }
    
}
