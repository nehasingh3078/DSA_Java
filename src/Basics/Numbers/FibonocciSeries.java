package Basics.Numbers;

public class FibonocciSeries {
    public static void main(String[] args) {
        //The Fibonacci series is a sequence where each number is the sum of the previous two numbers.
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
        int num=10;
        int a = 0;
        int b = 1;


        for(int i=0; i<num; i++){
            System.out.println(a + " ");  //prints 0
            int c = a + b; // c= 0+1 =1, c= 1+1=2, c= 1+2=3, c=2+3 ...
            a = b; // a= 1 , a=1, a=2, a=3 ...
            b = c; // b= 1 , b=2, b=3, b=5 ...

        }

    }

}
