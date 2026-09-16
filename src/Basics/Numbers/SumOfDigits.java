package Basics.Numbers;

public class SumOfDigits {
    public static void main(String[] args) {
        //int number = 1234;
        System.out.println(sum(123456789));

    }

    public static int sum(int number) {

        int sum = 0;
        while(number !=0){
            int remainder = number % 10;
            sum = sum + remainder;

            number /=10;

        }
        return sum;
    }
}