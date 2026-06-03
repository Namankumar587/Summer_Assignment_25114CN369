//Write a program to Check strong number.


import java.util.Scanner;

public class prog18 {
    public static void main(String[] args) {
        int n, sum = 0, r;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int temp = n;
        while (n > 0) {
            r = n % 10;
            sum = sum + factorial(r); 
            n = n / 10;
        }

        if (temp == sum) {
            System.out.println(temp + " is a strong number.");
        } else {
            System.out.println(temp + " is not a strong number.");
        }
    }

    static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
