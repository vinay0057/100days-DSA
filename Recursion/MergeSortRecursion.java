package Recursion;

import java.util.Arrays;

public class MergeSortRecursion {
    public static void main(String[] args) {
        int arr[] = {4, 5, 3, 1, 7, 6, 2, 8};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int arr[]){
        if(arr.length == 1 )return;
        int n = arr.length;
        //Step 1: create 2 empty arrays, of n/2 size each, (for odd n - n/2)
        int a[] = new int[n/2];
        int b[] = new int[n - n/2];
        //Step 2: copy-  paste arr element in a and b
        int idx = 0;
        for(int i=0; i<a.length; i++) a[i] = arr[idx++];
        for(int i=0; i<b.length; i++) b[i] = arr[idx++];

        //Step - 3 magic
        mergeSort(a);
        mergeSort(b);

        //Step - 4 merge two sorted array
        MergeTwoSortedArray.merge(a,b,arr);
    }
}
