//Write a program to Find common characters in strings.

import java.util.Scanner;

public class prog98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        
        String commonChars = "";
        
        for (char c : str1.toCharArray()) {
            if (str2.indexOf(c) != -1 && commonChars.indexOf(c) == -1) {
                commonChars += c;
            }
        }
        
        if (commonChars.isEmpty()) {
            System.out.println("No common characters found.");
        } else {
            System.out.println("Common characters: " + commonChars);
        }
    }
    
}
