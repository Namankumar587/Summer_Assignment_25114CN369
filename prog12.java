// Write a program to Find LCM of two numbers.

import java.util.Scanner;

public class prog12 {
    public static void main(String[] args) {
        
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        n1 = sc.nextInt();
        System.out.println("Enter second number");
        n2 = sc.nextInt();

        int lcm = (n1 > n2) ? n1 : n2;
        while(true) {
            if(lcm % n1 == 0 && lcm % n2 == 0) {
                System.out.println("LCM = " + lcm);
                break;
            }
            lcm++;
        }
    }
}