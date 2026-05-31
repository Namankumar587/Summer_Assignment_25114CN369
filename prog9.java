//Write a program to Check whether a number is prime.


import java.util.Scanner;

public class prog9 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int flag = 0;
        if((n == 0) || (n == 1)) {
            System.out.println(n + "is not a prime number");

        }
        else {
            int midnum = n / 2;
            for(int i=2; i<=midnum;i++) {
                if(n % i == 0){
                    System.out.println(n + "is not a prime number");
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0){
            System.out.println(n + " is prime number");

        }
    }
    
}
