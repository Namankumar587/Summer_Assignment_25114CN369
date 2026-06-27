//Write a program to Create ATM simulation.

import java.util.Scanner;

public class prog103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000; 
        int pin = 1234; 
        int attempts = 0;
        boolean authenticated = false;

        
        while (attempts < 3 && !authenticated) {
            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();
            if (enteredPin == pin) {
                authenticated = true;
            } else {
                attempts++;
                System.out.println("Incorrect PIN. Attempts left: " + (5 - attempts));
            }
        }

        if (!authenticated) {
            System.out.println("Too many incorrect attempts. Exiting.");
            return;
        }

        
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposited: $" + depositAmount);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrew: $" + withdrawAmount);
                    } else {
                        System.out.println("Invalid amount or insufficient funds.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    
}
