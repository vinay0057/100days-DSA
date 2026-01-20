package Recursion;

public class RecursionOnArrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        printArr(arr, 0);
    }
    public static void printArr(int arr[], int st){
        if(st == arr.length) return;
        System.out.print(arr[st]+" ");
        printArr(arr, st+1);
    }
}
