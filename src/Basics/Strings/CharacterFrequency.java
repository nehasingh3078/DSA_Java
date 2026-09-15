package Basics.Strings;

import java.util.*;


public class CharacterFrequency {
    public static void main(String[] args) {
        String s = "swiss";

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
        for( char ch: s.toCharArray()){
            if(map.get(ch)==1){
                System.out.println("Firs Non-repeating Character: " + ch);
                break;
            }
        }

    }
}

