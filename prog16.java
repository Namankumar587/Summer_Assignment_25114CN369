//Write a program to Print Armstrong numbers in a range.
import java.util.Scanner;

public class prog16 {
    public static void main(String[] args) {
        int start, end;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start: ");
        start = sc.nextInt();
        System.out.println("Enter the end: ");
        end = sc.nextInt();

        System.out.println("Armstrong numbers in the range " + start + " to " + end + " are: ");
        for (int i = start; i <= end; i++) {
            int n = i, sum = 0, r;
            while (n > 0) {
                r = n % 10;
                sum = sum + (r * r * r);
                n = n / 10;
            }
            if (i == sum) {
                System.out.print(i + " ");
            }
        }
    }
}
