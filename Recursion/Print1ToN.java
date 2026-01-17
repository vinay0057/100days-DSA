package Recursion;

import java.util.Scanner;

public class Print1ToN {

    //declaring a global variable
    static int gb;
    public static void main(String[] args) {
        /*int n = 5;
        printNum(1, n);*/
        /*Scanner sc = new Scanner(System.in);
        gb = sc.nextInt();*/
        printNums(5);
    }
    public static void printNum(int x, int n){
        if(x > n) return;
        System.out.println(x);
        printNum(x+1, n);
    }

    public static void printNumWithOneVariable(int x){
        if(x > gb) return;
        System.out.println(x);
        printNumWithOneVariable(x+1);
    }

    /*In this method we are printing numbers recursively or in a backward direction
     once n reaches to 0, it start executing or finishing every methods remaining line
     there fore we get 1,2,3,4,5*/
    public static void printNums(int n){
        if(n == 0) return;
        printNums(n-1);
        System.out.println(n);
    }

}
