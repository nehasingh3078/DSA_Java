package Basics.Numbers;

public class SwapTwoNumbers {
    public static void main (String[] args){
        int a = 20;
        int b = 40;
        System.out.println("Before swap: a = " + a + ", b = " + b);

        //method 1 using temp variable
        int temp = a;
         a = b;
         b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);


        //method 2 using XOR operator
        int n1 = 30;
        int n2 = 60;
        System.out.println("Before swap: n1 = " + n1 + ", n2 = " + n2);
        n1 = n1^n2; //n1= 30^60
        n2 = n1^n2; //n2 = (30^60)^60 = 30
        n1 = n1^n2; //n1 = (30^60)^30 = 60

        System.out.println("After swap: n1 = " + n1 + ", n2 = " + n2);

        //Method 3 Arithematic expression
        int a1 = 10;
        int b1 = 20;
        System.out.println("Before swap: a1 = " + a1 + ", b1 = " + b1);
        a1= a1+b1; //30
        b1= a1-b1; //10
        a1= a1-b1; //20
        System.out.println("Before swap: a1 = " + a1 + ", b1 = " + b1);


    }
}
