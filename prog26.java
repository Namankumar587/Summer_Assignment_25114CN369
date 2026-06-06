//Write a program to Convert binary to decimal.

import java.util.Scanner;

public class prog26 {
    public static void main (){
        int binary, decimal = 0, power = 1;
        System.out.println("Enter a binary number: ");
        Scanner sc = new Scanner(System.in);
        binary = sc.nextInt();

        while (binary>0) {
            int lastDigit = binary % 10;
            decimal = decimal + lastDigit * power;
            power = power * 2;
            binary = binary / 10;
        }
        System.out.println("Decimal equals to: " + decimal);
    }
}
