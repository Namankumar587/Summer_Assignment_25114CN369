//Write a program to Check palindrome string.

import java.util.Scanner;

public class prog85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();
        
        String reversedString = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString =  reversedString + inputString.charAt(i);
        }
        
        if (inputString.equals(reversedString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
    
}
