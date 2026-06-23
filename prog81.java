//Write a program to Find string length without strlen().

import java.util.Scanner;

public class prog81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();
        
        int length = 0;
        for (char c : inputString.toCharArray()) {
            length++;
        }
        
        System.out.println("Length of the string: " + length);
    }    
}
