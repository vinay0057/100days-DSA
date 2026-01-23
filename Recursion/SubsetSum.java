package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {
    public static void main(String[] args) {
        int arr[] = {2, 3};
        List<Integer> ls = new ArrayList<>();
        sums(0, arr, 0, ls);
        System.out.println(ls);
    }
    public static void sums(int sum, int arr[], int idx, List<Integer> lst){
        if(idx == arr.length){
            lst.add(sum);
            return;
        }
        sums(sum+arr[idx], arr, idx+1, lst);
        sums(sum, arr, idx+1, lst);
    }
}
