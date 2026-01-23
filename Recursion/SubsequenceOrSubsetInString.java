package Recursion;

public class SubsequenceOrSubsetInString {
    public static void main(String[] args) {
        String s = "abc";
        subset("", s, 0);
    }
    public static void subset(String ans, String s, int idx){
        if(idx == s.length()){
            System.out.print(ans+" ");
            return;
        }
        //here we are not saying that there is any if-else condition
        //it will do 2 operations pick and unpick
        subset(ans+s.charAt(idx), s, idx+1);
        subset(ans, s, idx+1);
    }
}
