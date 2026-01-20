package Recursion;

/*
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
*/

public class PowLeetcode50 {
    public static void main(String[] args) {
        System.out.println(myPow(2.0, -2));
    }
    public static double myPow(double x, int n) {
        if(n > 0) return pow(x, n);
        else if(n < 0) return minusPow(x, n);
        else return 1;
    }

    public static double pow(double x, int n){
        if(n == 0) return 1;
        double call = pow(x, n/2);
        if(n % 2 == 0) return call*call;
        else return x*call*call;
    }

    public static double minusPow(double x, int n){
        n *= -1;
        double power = pow(x, n);
        double numerator = 1;
        double result = numerator/power;
        return result;
    }
}
