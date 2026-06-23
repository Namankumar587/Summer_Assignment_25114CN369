//Write a program to Compress a string.

import java.util.Scanner;

public class prog94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();
        
        StringBuilder compressedString = new StringBuilder();
        int count = 1;
        
        for (int i = 0; i < inputString.length(); i++) {
            if (i + 1 < inputString.length() && inputString.charAt(i) == inputString.charAt(i + 1)) {
                count++;
            } else {
                compressedString.append(inputString.charAt(i));
                if (count > 1) {
                    compressedString.append(count);
                }
                count = 1;
            }
        }
        
        System.out.println("Compressed string: " + compressedString.toString());
    }
    
}
