package Basics.Numbers;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }

    public static boolean isArmstrong(int number) {
        int digits = String.valueOf(number).length();
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == number;
    }

}
