package Basics.Numbers;

public class SmallestDigit {
   // Find smallest digit in a number
    public static void main (String[] args){
        int num = 756323;
        int smallest = 9; //since 9 is the highest digit

        while(num !=0){
            int remainder = num %10;
            if (remainder < smallest){
                smallest = remainder;
            }
            num = num/10;
        }
        System.out.println(smallest);
    }

}
