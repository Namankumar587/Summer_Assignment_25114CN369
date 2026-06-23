//Write a program to Find maximum occurring character.

import java.util.Scanner;


public class prog92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();
        
        char maxOccurringChar = findMaxOccurringCharacter(inputString);
        
        if (maxOccurringChar != '\0') {
            System.out.println("Maximum occurring character: " + maxOccurringChar);
        } else {
            System.out.println("No characters found.");
        }
    }
    
    static char findMaxOccurringCharacter(String str) {
        int[] charCount = new int[256]; 
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }
        
        char maxChar = 0;
        int maxCount = 0;
        
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                maxChar = (char) i;
            }
        }
        
        return maxChar;
    }
    
}
