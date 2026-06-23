//Write a program to Reverse a string.

import java.util.Scanner;

public class prog82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();
        
        String reversedString = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString =  reversedString + inputString.charAt(i);
        }
        
        System.out.println("Reversed string: " + reversedString);
    }
    
}
