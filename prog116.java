//Write a program to Create inventory management system.

import java.util.Scanner;

public class prog116 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] itemNames = new String[n];
        int[] quantities = new int[n];
        double[] prices = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for item " + (i + 1) + ":");
            System.out.print("Item Name: ");
            itemNames[i] = sc.nextLine();
            
            System.out.print("Quantity: ");
            quantities[i] = sc.nextInt();
            sc.nextLine(); 
            
            System.out.print("Price: ");
            prices[i] = sc.nextDouble();
            sc.nextLine(); 
        }

        System.out.println("\nInventory Records:");
        for (int i = 0; i < n; i++) {
            System.out.println("Item " + (i + 1) + ": Name: " + itemNames[i] + ", Quantity: " + quantities[i] + ", Price: $" + prices[i]);
        }
    }

    
}
