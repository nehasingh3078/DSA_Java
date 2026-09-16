package Basics.Numbers;

public class NeonNumber {
    //Check Neon Number in Java
    //A Neon number is a number where the sum of the digits of its square equals the original number.
    //Example: 9
    //9² = 81
    //8 + 1 = 9
    public static void main (String[] args){
        int num = 9;
        int sqr = num*num;
        int result = 0;
        while(sqr !=0){
            int rem = sqr %10; // 1 , 8
            result = result + rem; // 0 +1, 1+8
            sqr = sqr/10;
        }
        if(result == num){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not a Neon Number");
        }

    }
}
