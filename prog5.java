//Write a program to Find sum of digits of a number.

import java.util.Scanner;
public class prog5 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number to find the sum of digits: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int sum = 0;
        while(n > 0) {
            int lastdigit = n % 10;
            n = n / 10;
            sum = sum + lastdigit;

        }
        System.out.println("Sum of all digits is:" + sum);

    }
    
}
