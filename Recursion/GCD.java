package Recursion;

public class GCD {
    public static void main(String[] args) {
        /*findHCF(12, 15);*/
        System.out.println(gcd(8,4));

    }
    public static void findHCF(int a, int b){
        int max = Math.max(a, b);
        for(int i=max/2; i>=0; i--){
            if(a%i == 0 && b%i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
    //TC - O(log(min(a,b)), coz we never search above min(a,b);
    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, b%a);
    }
}
