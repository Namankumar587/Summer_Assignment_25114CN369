//Write a program to Write function to find maximum.



public class prog42 {
    public static int findMaximum(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int max = findMaximum(num1, num2);
        System.out.println("Maximum of " + num1 + " and " + num2 + " is: " + max);
    }
}

    

