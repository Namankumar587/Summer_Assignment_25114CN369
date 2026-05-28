// Write a program to Calculate sum of first N natural numbers.

import java.util.Scanner;
public class prog1{

    public static void main(String[] args) {
        
        int n, sum=0;
        System.out.print("Enter no of Terms");

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }

        System.out.print("ADDITION" + sum);

    }
} 