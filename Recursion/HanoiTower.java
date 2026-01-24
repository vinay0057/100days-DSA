package Recursion;

public class HanoiTower {
    public static void main(String[] args) {
        int n = 3;
        hanoi(n, 'A', 'B', 'C');
    }
    //In this question first we have to play a game in math.io
    /*and play for n = 3, so there we observe that first we have to move
     n-1 discs to B rod, with help of C rod
     even better assume for 2 discs, now we first have to move
     n-1 disc which is 1 disc to B, coz at a time we can move only
     1 disc that too the small disc and we cannot put big disc
     in above small disc, therefore we first have to move the small disc
     or n-1 disc to rod B then the n disc directly to C rod, then move the
     n-1 disc from rod B to rod C, there fore it follows a pattern
     every time we have to move n-1 disc to rod B with help of rod C
     and then after doing that we have to move the greatest disc to rod C
     then again move n-1 discs from rod B to rod C with help of rod A*/
    public static void hanoi(int n, char A, char B, char C){
        if(n == 0)return;
        //n-1 A to B via C , via rod is a helper rod, and it will come in middle
        hanoi(n-1, A, C, B);
        //Largest A -> C
        System.out.println(A+"->"+C);
        //n-1 B -> C via A
        hanoi(n-1, B,A,C);
    }
}
