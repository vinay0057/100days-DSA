package Recursion;

public class RecursionOnArrays {
    public static void main(String[] args) {
       /* int arr[] = {1,2,3,1};
        printArr(arr, 0);*/
        System.out.println(linearSearchWithRecursion(new int[]{5,3,7,12,76,9,34,5}, 6));
    }
    public static void printArr(int arr[], int st){
        if(st == arr.length) return;
        System.out.print(arr[st]+" ");
        printArr(arr, st+1 );
    }

    public static boolean linearSearchWithRecursion(int arr[], int target){
        int n = arr.length;
        int st = 0;
        return checkIfExisit(arr, target, st, n);
    }

    public static boolean checkIfExisit(int arr[], int target, int st, int end){
        if(st == end) return false;
        if(arr[st] == target) return true;
        return checkIfExisit(arr, target, st+1, end);
    }

}
