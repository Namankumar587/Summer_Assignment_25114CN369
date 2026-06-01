//Write a program to Generate Fibonacci series.

import java.util.Scanner;

public class prog13 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int n1 = 0, n2 = 1;
        System.out.print("Fibonacci series: " + n1 + " " + n2 + " ");
        for(int i=2; i<n; i++) {
            int n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}
