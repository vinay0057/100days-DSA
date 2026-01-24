package Recursion;

public class PreInPost {
    public static void main(String[] args) {
        pip(4);
    }
    public static void pip(int n){
        if(n == 0) return;
        System.out.print("Pre "+n+" ");//pre
        pip(n-1); //f1
        System.out.print("In "+n+" ");//in
        pip(n-1);
        System.out.print("Post "+n+" ");//post
    }
}
