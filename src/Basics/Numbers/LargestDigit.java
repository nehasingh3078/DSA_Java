package Basics.Numbers;

public class LargestDigit {
    public static void main (String[] args){
        //Find largest digit in a number
        int num =1278934;
        int largest = 0;
        while(num != 0){
           int remainder = num % 10;
           if(remainder>largest){
               largest = remainder;
           }
            num = num/10;

        }
        System.out.println(largest);


    }


}
