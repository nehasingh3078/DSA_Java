package Basics.Numbers;

public class GcdHcf {
    // Find GCD / HCF
    //GCD (Greatest Common Divisor) is the largest number that divides both numbers.
    //Example:
    //12 → 1, 2, 3, 4, 6, 12
    //18 → 1, 2, 3, 6, 9, 18
    //GCD = 6

    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        //using Euclidean algorithm
        while (b != 0) {        //a = 12, b = 18 ,
            int rem = a % b;    // 12 % 18 = 12, //18 % 12 = 6, // 12 % 6 = 0
            a = b;              //a = 18, //a = 12, //a = 6
            b = rem;            //b = 12, //b = 6, //b = 0

        }
        System.out.println("GCD = " + a);
    }
}












