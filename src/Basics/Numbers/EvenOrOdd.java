package Basics.Numbers;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num = 24;
        System.out.println(isEven(num) ? "Even" : "Odd");
    }

    public static boolean isEven(int num) {
        return (num % 2) == 0;
    }
}
