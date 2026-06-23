//Write a program to Check string rotation.

import java.util.Scanner;

public class prog93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        
        if (str1.length() != str2.length()) {
            System.out.println("The strings are not rotations of each other.");
            return;
        }
        
        String concatenatedString = str1 + str1;
        
        if (concatenatedString.contains(str2)) {
            System.out.println("The strings are rotations of each other.");
        } else {
            System.out.println("The strings are not rotations of each other.");
        }
    }
    
}
