package Basics.Strings;

public class LongestString {
    public static void main(String[] args) {
        String s = "I love Automation";
      String []  words = s.split(" ");
        String longest = "";
        for(String word: words){
            if(word.length()>longest.length()){
                longest = word;

            }
        }
        System.out.println("Longest word: " + longest);

    }
}
