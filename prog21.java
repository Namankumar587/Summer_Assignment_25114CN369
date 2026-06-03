//Write a program to Convert decimal to binary.




import java.util.Scanner;

public class prog21 {
    public static void main (String[] args) {
        int n;
        System.out.println("Enter decimal number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        String binary = "  ";
        while(n>0) {
            binary = (n%2) + binary;
            n=n/2;
        }
        System.out.println("Binary equivalent: " + binary);
    }
}
