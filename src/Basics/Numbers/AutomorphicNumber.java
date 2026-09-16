package Basics.Numbers;

public class AutomorphicNumber {
//    Check Automorphic Number in Java
//    An automorphic number is a number whose square ends with the number itself.
//            Examples:
//            5² = 25   → ends with 5 → Automorphic
//6² = 36   → ends with 6 → Automorphic
//25² = 625 → ends with 25 → Automorphic
    public static void main (String[] args){
        int num = 25;
        int sqr = num*num;
        System.out.println(num + " of square is: " + sqr);
        //this will work only for digit>0 it won't work for 10, 100, 1000...
//        int rem = sqr %10;
//        if(num == rem){
//            System.out.println("An automorphic Number");
//        }
//        else {
//            System.out.println("Not an automorphic Number");
//        }

        int temp =num;
        int divisor = 1;
        while(temp !=0){
            divisor = divisor * 10;
            temp = temp/10;
        }
        // Get last digits of square
        int rem = sqr % divisor;

        if(num == rem){
            System.out.println("An automorphic Number");
        }
        else {
            System.out.println("Not an automorphic Number");
        }
    }

}
