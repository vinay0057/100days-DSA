package BitManipulation;

public class SetBitOrNot {
    public static void main(String[] args) {
        System.out.println(1 | 22);
    }
    static boolean checkKthBit(int n, int k) {
        // code here
        /*k += 1;
        String num = Integer.toBinaryString(n);
        if(k > num.length()) return false;
        else if(num.charAt(num.length()-k) != '1') return false;

        return true;*/

        int num = n >> k;
        return(num % 2 != 0);
    }
    static int setKthBit(int n, int k) {
        // code here
        int num = 1 << k;
        return n | num;
    }
}
