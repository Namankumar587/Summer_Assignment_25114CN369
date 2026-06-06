//Write a program to Recursive factorial.

import java.util.Scanner;

public class prog25 {
    public static void main (){
        int n;
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);

    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}

























