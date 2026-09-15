package Basics.Strings;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Neha is a good girl?";
        String [] words = s.split(" ");

        // reverse string using stringBuilder
        String reverse = new StringBuilder(s).reverse().toString();
        System.out.println(reverse);


        // reverse only second word

        for (int i = 0; i < words.length; i++) {
            // i + 1 because array index starts from 0
            if ((i + 1) % 2 == 0) {
                words[i] = new StringBuilder(words[i]).reverse().toString();

            }
        }
        System.out.println(String.join(" ", words));
    }
}