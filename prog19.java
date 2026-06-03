//Write a program to Print factors of a number.


import java.util.Scanner;

public class prog19 {
    public static void main(String[] args){
        int n;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println("Factors of " + n + " are: ");
        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
