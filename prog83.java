//Write a program to Count vowels and consonants.

import java.util.Scanner;

public class prog83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();
        
        int vowelCount = 0;
        int consonantCount = 0;
        
        for (char c : inputString.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            } else if (c >= 'a' && c <= 'z') {
                consonantCount++;
            }
        }
        
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
    
}
