//Write a program to Print multiplication table of given number.

import java.util.Scanner;

public class prog2 {
    public static void main(String[] args){
        int n;
        System.out.print("Enter number for multipication table: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=1; i<=n; i++)
            System.out.println(n + " x " + i + " = " + (n * i));

    }

}
