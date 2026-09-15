package Basics.Numbers;

public class Palindrome {

    public static void main(String[] args) {
        int num = 12321;
        System.out.println(isPalindromeNumber(num) ? "Palindrome" : "Not palindrome");
    }

    public static boolean isPalindromeNumber(int num) {
        if (num < 0 || (num % 10 == 0 && num != 0)) {
            return false;
        }
        int reversed = 0;
        while (num > reversed) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }
        return num == reversed || num == reversed / 10;
    }

}
