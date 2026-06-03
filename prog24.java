//Write a program to Find x^n without pow().


import java.util.Scanner;

public class prog24 {
    public static void main (){
        int x, n;
        System.out.println("Enter the value of x: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        System.out.println("Enter the value of n: ");
        n = sc.nextInt();

        int result = 1;
        for(int i=1;i<=n;i++) {
            result = result*x;
        }
        System.out.println(x + " raised to the power " + n + " is: " + result);


    }
}
