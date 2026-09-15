package Basics.Numbers;

public class Fibonocci {
    public static void main(String[] args) {
        int num = 13;
        System.out.println(isFibonacciNumber(num) ? "Fibonacci series Number" : "Not a Fibonacci series Number");
    }

    // Verifies if a given value belongs to the Fibonacci sequence
    public static boolean isFibonacciNumber(int n) {
        int first = 0, second = 1;
        while (first < n) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return first == n;
    }
}
