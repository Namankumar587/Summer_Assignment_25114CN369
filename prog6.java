//Write a program to Reverse a number.

import java.util.Scanner;

public class prog6 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int ans = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            ans = ans * 10 + lastdigit;
            n = n / 10;
        }
        System.out.println("Reverse number: " + ans);
    }
}