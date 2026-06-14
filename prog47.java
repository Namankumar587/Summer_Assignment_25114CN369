//Write a program to Write function for Fibonacci.



public class prog47 {
    public static int findFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return findFibonacci(n - 1) + findFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Fibonacci of " + num + " is: " + findFibonacci(num));
    }
}


