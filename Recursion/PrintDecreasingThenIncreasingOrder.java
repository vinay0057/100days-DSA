package Recursion;

public class PrintDecreasingThenIncreasingOrder {
    static int max = 0;
    public static void main(String[] args) {
        int num = 5;
        //printDecreasing(num);
        increaseThenDecrease(num);
    }

    public static void printDecreasing(int n){ // n = 5
        if(n == 0) {
            printIncreasing(n+1, max);
            return;
        }
        if(n > max) max = n;
        System.out.println(n);
        printDecreasing(n-1);
    }

    public static void printIncreasing(int x, int n){
        if(x > n) return;
        System.out.println(x);
        printIncreasing(x+1, n);
    }

    /*Instead above methods we can make only one method and solve
    * the question
    *
    * this will print 5 4 3 2 1 1 2 3 4 5
    * what if we want to print 1 only once*/
    public static void increaseThenDecrease(int n){
        if(n == 0) return;
        System.out.print(n+ " ");
        increaseThenDecrease(n-1);
        if(n != 1) System.out.print(n+ " ");
    }

}
