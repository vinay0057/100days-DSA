package BinarySearch;

import java.util.Arrays;

public class FindFirstAndLastIndex {
    public static void main(String[] args) {
        int arr[] = {};
        System.out.println(Arrays.toString(searchRangeFLI(arr, 0)));
    }

    public static int[] searchRangeFLI(int arr[], int target){
        int len = arr.length;

        if(len == 0) return new int[] {-1, -1};
        if(target < arr[0] || target > arr[len-1]) return new int[] {-1, -1};

        int firstIndex = firstIndex(arr, target);
        int lastIndex = lastIndex(arr, target);

        return new int[]{firstIndex, lastIndex};
    }

    public static int firstIndex(int arr[], int target){
        int len = arr.length;

        int st = 0, end = len-1;
        int firstIndexPosition = -1;
        while(st <= end){
            int mid = st + (end - st)/2;

            if(target == arr[mid]) {
                firstIndexPosition = mid;
                end = mid - 1;
            }else if(target > arr[mid]) st = mid + 1;
            else end = mid - 1;
        }

        return firstIndexPosition;
    }
    public static int lastIndex(int arr[], int target){
        int len = arr.length;

        int st = 0, end = len-1;
        int lastIndexPosition = -1;
        while(st <= end){
            int mid = st + (end - st)/2;

            if(target == arr[mid]) {
                lastIndexPosition = mid;
                st = mid + 1;
            }else if(target > arr[mid]) st = mid + 1;
            else end = mid - 1;
        }

        return lastIndexPosition;
    }
}
