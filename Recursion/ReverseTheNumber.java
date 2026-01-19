package Recursion;

//this code is correct but not interview ready
//interviewers dont want global variables
public class ReverseTheNumber {
    //static int rev = 0;
    public static void main(String[] args) {
        System.out.println(reverse(40, 0));
    }
    //with global variable
    /*public static int reverse(int n){
        if(n <= 0) return rev;
        int temp = n % 10;
        rev = rev * 10 + temp;
        return reverse(n/10);
    }*/
    //interview acceptable
    public static int reverse(int n, int r){
        if(n <= 0) return r;
        return reverse(n/10, r*10+n%10);/*This equals to r = r*10 + n%10*/
    }
}
