package Basics.Numbers;

public class Lcm {
    //LCM (Least Common Multiple) is the smallest positive number divisible by both numbers.
    //For example, for 12 and 18:
    //12 → 12, 24, 36, 48...
    //18 → 18, 36, 54...
    //LCM = 36
    //A useful formula is:
    //LCM = (a × b) / GCD
    public static void main(String[] args) {
        int a = 4;
        int b= 30;
        int lcm = (a * b) / hcf(a,b);
        System.out.println(lcm);
    }
    public static int hcf(int a, int b){

        //find hcf
        //using Euclidean algorithm to find hcf
        while (b != 0) {        //a = 12, b = 18 ,
            int rem = a % b;    // 12 % 18 = 12, //18 % 12 = 6, // 12 % 6 = 0
            a = b;              //a = 18, //a = 12, //a = 6
            b = rem;            //b = 12, //b = 6, //b = 0

        }
        return a;

    }
}
