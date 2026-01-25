package Recursion;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int a[] = {4,7,9,12};
        int b[] = {1,3,4,5};
        int c[] = new int[a.length+b.length];
        merge(a, b, c);
        System.out.println(Arrays.toString(c));
    }
    public static void merge(int a[], int b[], int c[]){
        int idx = 0, i=0, j=0;
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]) c[idx++] = a[i++];
            else c[idx++] = b[j++];
        }
        while(i < a.length) c[idx++] = a[i++];
        while(j < b.length) c[idx++] = b[j++];
    }
}
