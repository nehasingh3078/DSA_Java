package Basics.Numbers;

public class PerfectNumber {
    public static void main (String[] args){
        //6= 1+2+3 = 6 and 6*1, 3*2 hence it has 1,2,3 divisors
        //Examples of perfect numbers: 6, 28, 496, 8128.
        int num = 8128;
        int sum = 0;

        for(int i=1; i<num; i++ ){

            if(num % i == 0){
                sum = sum + i;
            }
        }
        if( sum == num) {
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not a Perfect Number");
        }
    }
}
