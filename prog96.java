//Write a program to Remove duplicate characters.

import java.util.Scanner;

public class prog96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();
        
        StringBuilder result = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }
        
        System.out.println("String after removing duplicates: " + result.toString());
    }
    
}
