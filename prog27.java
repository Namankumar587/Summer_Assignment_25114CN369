//Write a program to Count set bits in a number.

import java.util.Scanner;

public class prog27 {
    public static void main () {
        int n, count = 0;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        System.out.println("Number of set bits: " + count);
        
    }
}
