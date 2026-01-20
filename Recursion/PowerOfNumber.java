package Recursion;

public class PowerOfNumber {
    public static void main(String[] args) {
        //System.out.println(power2(2,8));
    }
    //TC - O(b)
    public static long power(int a, int b){
        if(b == 0) return 1;
        return a * power(a, b-1);
    }
    //TC - O(log b) Space - O(log b)
    public static long power2(int a, int b){
        if(b == 0) return 1;
        long call = power2(a, b/2);
        if(b % 2 == 0) return call * call;
        else return a*call*call;
    }
}
