package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        /*String s1 = "listen";
        String s2 = "silest";

        int count = 0;
        String s3[] = s1.split("");
        for(int i=0; i<s1.length(); i++){
            if(s2.contains(s3[i])) count++;
        }

        if(count == s1.length()) System.out.println("Anagrams");
        else System.out.println("Not Anagrams");*//*

        int ar[] = {1,2};
        System.out.println(Arrays.toString(ar));
        ar[1]++;
        System.out.println(Arrays.toString(ar));*/

        String s1 = "listen";
        String s2 = "silent";

        char[] s1char = s1.toCharArray();
        char[] s2char = s2.toCharArray();

        Arrays.sort(s1char);
        Arrays.sort(s2char);

        if(Arrays.equals(s1char, s2char)) System.out.println(true);
        else System.out.println(false);
    }
}
