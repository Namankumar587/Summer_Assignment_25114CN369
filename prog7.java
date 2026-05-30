//Write a program to Find product of digits.

import java.util.Scanner;
public class prog7 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int product = 1;
        while(n != 0) {
            int digit = n % 10;
            product = product * digit;
            n = n / 10;

        }
        System.out.println("Products of digits:" + product);

    }
}
