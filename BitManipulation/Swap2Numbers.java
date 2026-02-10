package BitManipulation;

public class Swap2Numbers {
    public static void main(String[] args) {
        //swap 2 numbers without using temp

        //method - 1
        /*int a = 2;
        int b = 5;
        System.out.println(a+ " "+ b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a+ " "+ b);*/

        //method - 2
        int a = 7;
        int b = 3;
        System.out.println(a+ " "+ b);

        a = a ^ b;
        b = a ^ b;
        a = a^ b;

        System.out.println(a+ " "+ b);
    }
}
