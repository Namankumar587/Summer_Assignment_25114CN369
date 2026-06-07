//Write a program to Recursive sum of digits.

import java.util.Scanner;   

public class prog27 {
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + sumOfDigits(n / 10);
        }
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int result = sumOfDigits(n);
        System.out.println("Sum of digits of " + n + " is: " + result);
    }

}
