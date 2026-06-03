//Write a program to Find largest prime factor.

import java.util.Scanner;

public class prog20 {
    public static void main (String[] args) {
        int n;
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int largestPrimeFactor = 1;
        for(int i=2; i<=n; i++) {
            while(n % i == 0) {
                largestPrimeFactor = i;
                n = n / i;
            }
        }
        System.out.println("Largest prime factor: " + largestPrimeFactor);

    }
}
