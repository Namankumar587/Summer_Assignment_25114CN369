//Write a program to Remove spaces from string.

import java.util.Scanner;


public class prog88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();
        
        String stringWithoutSpaces = inputString.replaceAll("\\s+", "");
        
        System.out.println("String without spaces: " + stringWithoutSpaces);
    }
    
}
