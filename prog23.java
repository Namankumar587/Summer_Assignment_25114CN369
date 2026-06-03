//Write a program to Count set bits in a number.


import java.util.Scanner;

public class prog23 {
    public static void main (){
        int n;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int count = 0;
        while(n>0) {
            if((n&1) == 1) {
                count++;
            }
            n = n>>1;
        }
        System.out.println("Number of set bits: " + count);

    }
}
