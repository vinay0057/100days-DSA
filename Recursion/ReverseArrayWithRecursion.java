package Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArrayWithRecursion {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(reversedArray(arr)));
    }
    public static int[] reversedArray(int arr[]){
        int i = 0, j = arr.length-1;
        return reverse(arr, i, j);
    }
    public static int[] reverse(int arr[], int i, int j){
        if(i > j) return arr;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return reverse(arr, i+1, j-1);
    }
}
