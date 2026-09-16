package Basics.Numbers;

public class StrongNumber {
//    Check Strong Number in Java
//    A Strong number is a number where the sum of the factorials of its digits equals the original number.
//    Example: 145
//            1! + 4! + 5!
//            = 1 + 24 + 120 = 145

   public static void main (String[] args){
       int num = 145;
       int temp = num;
       int sum = 0;

       while(temp !=0) {
           int rem = temp % 10; //5 , 4 , 1
           int fact = 1;

           for (int i = 1; i <= rem; i++) {
               fact = fact * i;
           }

           sum = sum +fact;
           temp = temp / 10;


       }
       if (num == sum){
           System.out.println("Strong Number");
       }
       else{
           System.out.println("Not a Strong Number");
       }
       System.out.println(sum);

       }

   }

