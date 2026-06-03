//Write a program to Convert binary to decimal. 

import java.util.Scanner;

public class prog22 {
    public static void main( String[] args) {
        int n;
        System.out.println("Enter binary number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int decimal = 0, power = 1;
        while(n>0) {
            int lastdigit = n%10;
            decimal = decimal + (lastdigit*power);
            power=power*2;
            n=n/10;
        }
        System.out.println("Decimal equivalent: " + decimal);

    }
}
