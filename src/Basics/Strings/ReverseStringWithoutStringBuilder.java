package Basics.Strings;

public class ReverseStringWithoutStringBuilder {
    public static void main (String [] args) {

        String s = "Neha is a good girl?";
        String[] words = s.split(" ");
    // reverse only second word

        for (int i = 0; i < words.length; i++) {
        // i + 1 because array index starts from 0
        if ((i + 1) % 2 == 0) {
           char [] ch = words[i].toCharArray();
           int left =0;
           int right = ch.length-1;
           while(left<right){
               char temp = ch[left];
               ch[left] = ch[right];
               ch[right] = temp;
               left ++;
               right--;
           }
            words[i] = new String(ch);

        }
    }
        System.out.println(String.join(" ", words));
}

//        //reverse each word
//        for (int i = 0; i < words.length; i++) {
//            char[] ch = words[i].toCharArray();
//            int left = 0;
//            int right = ch.length - 1;
//            while (left < right) {
//                char temp = ch[left];
//                ch[left] = ch[right];
//                ch[right] = temp;
//                left++;
//                right--;
//
//            }
//            words[i] = new String(ch);
//        }
//        System.out.println(String.join(" ", words));
//    }
}