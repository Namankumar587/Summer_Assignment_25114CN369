//Write a program to Print character pyramid.
     A
    ABA
   ABCBA
  ABCDCBA
 ABCDEDCBA


import java.util.Scanner;

public class prog40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                char ch = (char) ('A' + k - 1);
                System.out.print(ch);
            }
            for (int l = i - 1; l >= 1; l--) {
                char ch = (char) ('A' + l - 1);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}