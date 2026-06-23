//Write a program to Convert lowercase to uppercase.

import java.util.Scanner;

public class prog84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();
        
        String upperCaseString = "";
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (c >= 'a' && c <= 'z') {
                upperCaseString += (char)(c - 32);
            } else {
                upperCaseString += c;
            }
        }
        
        System.out.println("Uppercase string: " + upperCaseString);
    }
    
}
