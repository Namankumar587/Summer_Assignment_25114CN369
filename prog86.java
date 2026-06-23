//Write a program to Count words in a sentence.

import java.util.Scanner;

public class prog86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        int wordCount = 0;
        boolean isWord = false;
        
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c == ' ') {
                if (isWord) {
                    wordCount++;
                    isWord = false;
                }
            } else {
                isWord = true;
            }
        }
        
        if (isWord) {
            wordCount++;
        }
        
        System.out.println("Number of words in the sentence: " + wordCount);
    }
    
}
