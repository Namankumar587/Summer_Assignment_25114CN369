//Write a program to Write function to find factorial.


public class prog44 {
    public static int findFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * findFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int num = 5;
        int factorial = findFactorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
