package Strings;

import java.security.spec.ECField;

//this method comapres two Strings lexicographically - Dictionary Order.
//always check the ascii value;
public class CompareToMethod {

    public static int copyOfCompareTo(String a, String b){
        int alen = a.length();
        int blen = b.length();

        int n = Math.max(alen, blen);
            try {
                for (int i = 0; i < n; i++) {
                    if (a.charAt(i) != b.charAt(i)) return a.charAt(i) - b.charAt(i);
                    //System.out.println(i);
                }
            }catch (IndexOutOfBoundsException e){
                return a.length() - b.length();
            }
        return 0;
    }

    public static void main(String[] args) {
        /*String s1 = "aman"; //97 109 97 110
        String s2 = "amaan";//97 109 97 97 110*/
        String s1 = "";
        String s2 = "amaan";
        System.out.println(copyOfCompareTo(s1,s2)); // therefore we get 13 , aman > amaan
        //System.out.println('n'-'a');
    }
}
