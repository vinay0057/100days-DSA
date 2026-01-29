package CyclicSort;

public class MissingNumberWithCyclicSort {
    public static void main(String[] args) {

    }
    public int missingNumber(int[] arr) {
        int n = arr.length;

        int i = 0;
        while(i < n){
            if(arr[i] == i || arr[i] > n-1) i++;
            else{
                int idx = arr[i];
                swap(idx, i, arr);
            }
        }

        int j = 0;
        while(j < n){
            if(arr[j] != j) return j;
            j++;
        }
        return n;
    }

    public static void swap(int a, int b, int arr[]){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
