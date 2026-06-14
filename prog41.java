//Write a program to Write function to find sum of two numbers.

import java.util.Scanner;

public class prog41 {
    public static int findSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int sum = findSum(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
