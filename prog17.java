//Write a program to Check perfect number.

import java.util.Scanner;

public class prog17 {
    public static void main(String[] args) {
        int n, sum = 0;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=1; i<n; i++) {
            if(n % i == 0) {
                sum = sum + i;
            }
        }
        if(sum == n) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
    }
}
