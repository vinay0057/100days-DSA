package BitManipulation;

public class OnesAndTwoesComplement {
    public static void main(String[] args) {
        int x = 100;
        //~x 1's complement = -101
        //~x+1 2's complement = -100
        /*System.out.println(~x);
        System.out.println(~x+1);*/

        byte a = 127;
        a += 1;
        System.out.println(a);
    }
}
