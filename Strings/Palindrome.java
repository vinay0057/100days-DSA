package Strings;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        /*String s = "markras";
        System.out.println(s);
        change(s);
        System.out.println(s);*/
        String s = "vinay";
        StringBuilder sb = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");
        /*for(int i=s.length()-1; i>=0 ; i--){
            if(Character.isLetterOrDigit(s.charAt(i))) sb.append(s.charAt(i));
        }*/


        /*System.out.println(sb.equals(sb2));*/
        /*String str = "Hello chllo";
        String st[] = str.split(" ");
        System.out.println(Arrays.toString(st));
        System.out.println(String.join(" ", st));*/

        String st = ".  Hello World   amazon  ";
        System.out.println(st.trim());

        String str = "hello";
        System.out.println(str.indexOf('m'));

        System.out.println('b' - 'a');

        char c = (char)(97);
        System.out.println(c);
    }
    /*public static String change(String s){
        s = "pandey";
        return s;
    }*/
}
