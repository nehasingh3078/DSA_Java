package Basics.Numbers;

public class ReverseNumber {
    public static void main (String[] args){


//        int num = 123;
//        int length = String.valueOf(num).length();
//        int reverse= 0;
//        for(int i=length; i>0; i--){
//            reverse = reverse *10 + i;
//
//        }
//        System.out.println(reverse);
//
//    }

    //using whileloop
        int num = 123;
        int temp = num;
        int reverse= 0;
        int count =0;
        while(temp>0){
            count++;
            temp /=10;
        }
        for(int i=count; i>0; i--){
            reverse = reverse *10 + i;

        }
        System.out.println(reverse);

    }

    //using while loop
    public static int reverseNumber(int number) {

        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;      // Get last digit
            reverse = reverse * 10 + digit; // Add digit to reverse
            number /= 10;                 // Remove last digit
        }

        return reverse;
    }


}
