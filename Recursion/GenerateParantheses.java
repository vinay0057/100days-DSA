package Recursion;
import java.util.*;

public class GenerateParantheses {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(3));
    }
    public static List<String> generateParenthesis(int n) {
        int leftParen = 0, rightParen = 0;
        List<String> ls = new ArrayList<>();
        String paren = "";

        generate(paren, leftParen, rightParen, ls, n);

        return ls;
    }

    public static void generate(String paren, int l, int r, List<String> ls, int n){
        if(l == n && r == n) {
            ls.add(paren);
            return;
        }
        if(l < n) generate(paren+"(", l+1, r, ls, n);
        if(r < l) generate(paren+")", l, r+1, ls, n);
    }
}
