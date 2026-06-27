//Write a program to Create bank account system.

import java.util.Scanner;

public class prog110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bank accounts: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] accountHolders = new String[n];
        double[] balances = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for account " + (i + 1) + ":");
            System.out.print("Account Holder Name: ");
            accountHolders[i] = sc.nextLine();
            
            System.out.print("Initial Balance: ");
            balances[i] = sc.nextDouble();
            sc.nextLine(); 
        }

        System.out.println("\nBank Account Records:");
        for (int i = 0; i < n; i++) {
            System.out.println("Account " + (i + 1) + ": Account Holder: " + accountHolders[i] + ", Balance: $" + balances[i]);
        }
    }
    
}
