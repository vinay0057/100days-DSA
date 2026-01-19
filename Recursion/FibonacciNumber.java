package Recursion;

public class FibonacciNumber {
    static int a = 0;
    static int b = 1;
    public static void main(String[] args) {
        /*System.out.print(a + " "+ b+" ");
        fibo(5);*/
        System.out.println(Nfibo(5));
    }

    public static void fibo(int n){
        for(int i=0; i<n; i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
    }

    public static int Nfibo(int n){
        if(n == 0) return 0;
        else if(n == 1) return 1;
        return Nfibo(n-1) + Nfibo(n-2);
    }
}
