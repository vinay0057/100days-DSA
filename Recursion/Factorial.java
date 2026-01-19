package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int num = 0;
        //int factorialOfNum = factorial(num);
        //System.out.println(factorialOfNum);
    }

    public static int factorial(int n){
        if(n == 1 || n==0 ) return 1;
        return n * (factorial(n-1));
    }

}
