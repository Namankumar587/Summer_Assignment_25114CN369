//Write a program to Recursive reverse number.

import java.util.Scanner;

public class prog29 {
    public static void main () {
        int num, reversed = 0;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed number: " + reversed);
    }
    public static int reverseNumber(int n) {
        int reversed = 0;
        while(n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }
        return reversed;
    }
}
