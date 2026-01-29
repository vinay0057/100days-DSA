package Recursion;

import java.util.Arrays;

public class CountInversions {
    public static int count;
    public static void main(String[] args) {
        int arr[] = {1,3,2,3,1};
        System.out.println(Arrays.toString(count(arr)));
        System.out.println("Inversion Count: "+count);
    }

    public static int[] count(int arr[]){
        count = 0;
        mergeSort(arr);
        return arr;
    }

    public static void mergeSort(int arr[]){
        int n = arr.length;
        if(n == 1) return;

        //divide
        int a[] = new int[n/2];
        int b[] = new int[n - n/2];
        //copy values of old elements
        int idx = 0;
        for(int i=0; i<a.length; i++) a[i] = arr[idx++];
        for(int i=0; i<b.length; i++) b[i] = arr[idx++];
        //repeat, until length becomes 1
        mergeSort(a);
        mergeSort(b);

        merge(a, b, arr);

    }

    /*public static void merge(int a[], int b[], int c[]){


        int i=0, j=0, idx=0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]) c[idx++] = a[i++]; //a[i] is smaller
            else{ //it means a[i] > b[j] therefore put b[j] in c
                c[idx++] = b[j++];
                count += a.length - i;
            }
        }
        while(i < a.length) c[idx++] = a[i++]; //everything is sorted no need to increase count
        while(j < b.length) c[idx++] = b[j++];

    }*/

    public static void merge(int a[], int b[], int c[]){


        int i=0, j=0, idx=0;
        int l=0, m=0;
        while(l < a.length && m < b.length){
            if(a[l] > 2*b[m]){
                count += a.length - l;
                m++;
            }else l++;
        }
        while(i < a.length && j < b.length){
            if(a[i] < b[j]) c[idx++] = a[i++];  //a[i] is smaller
            else c[idx++] = b[j++];
        }
        while(i < a.length) c[idx++] = a[i++]; //everything is sorted no need to increase count
        while(j < b.length) c[idx++] = b[j++];

    }
}
