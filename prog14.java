//Write a program to Find nth Fibonacci term.

import java.util.Scanner;
public class prog14 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the position of the Fibonacci term: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int n1 = 0, n2 = 1;
        if (n == 1) {
            System.out.println("The " + n + "th Fibonacci term is: " + n1);
        } 
        else if (n == 2) {
            System.out.println("The " + n + "nd Fibonacci term is: " + n2);
        } 
        else {
            for (int i = 2; i <= n; i++) {
                int n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
            System.out.println("The " + n + "th Fibonacci term is: " + n2);
        }
    }
}
