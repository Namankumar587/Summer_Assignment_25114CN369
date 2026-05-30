//Write a program to Check whether a number is palindrome

import java.util.Scanner;
public class prog8 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int reversednumber=0, temp = n;
        while(temp > 0){
            int remainder = temp % 10;
            reversednumber = reversednumber * 10 + remainder;
            temp = temp / 10;

        }
        if(n == reversednumber)
            System.out.println("number is palindrome");
        else
            System.out.println("number is not palindrome");

    }
    
}
