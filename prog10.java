//Write a program to Print prime numbers in a range.


import java.util.Scanner;

public class prog10 {
    public static void main(String[] args) {
        int start = 10, end = 50;
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
        
    
    

