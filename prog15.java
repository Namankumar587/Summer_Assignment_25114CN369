//Write a program to Check Armstrong number.

import java.util.Scanner;

public class prog15 {
    public static void main(String[] args) {
        int n, sum = 0, r;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int temp = n;
        while (n>0) {
            r = n%10;
            sum = sum + (r * r * r);
            n = n/10;
        }
        if (temp == sum) {
            System.out.println(temp + " is an Armstrong number.");
        } else {
            System.out.println(temp + " is not an Armstrong number.");
        }
    }
}
