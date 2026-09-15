package Basics.Numbers;

public class FibonocciNth {

    public static void main(String[] args) {

        int targetIndex = 7;

        System.out.println(getNthFibonacci(targetIndex));
    }

    public static int getNthFibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        int first = 0;
        int second = 1;

        for (int i = 2; i <= n; i++) {
            int next = first + second;
            first = second;
            second = next;
        }

        return second;
    }
}