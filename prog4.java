import java.util.Scanner;

public class prog4 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        int count = 0;
        while(n!=0) {
            n = n / 10;
            count++;

        }
        System.out.println("Number of digits: " + count);
        }
    
}
