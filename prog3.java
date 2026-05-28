//Write a program to Find factorial of a number.

import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        int answer = factorial(number);
        System.out.println("factorial of " + number + " is " + answer);
    }
    
    static int factorial(int n) {
        if(n == 1)
            return 1;

        return n * factorial(n-1);
    }
    
}
