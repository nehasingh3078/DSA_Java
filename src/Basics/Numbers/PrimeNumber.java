package Basics.Numbers;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 11;
        System.out.println(isPrime(num) ? "Prime" : "Not Prime");
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;


    }
}
