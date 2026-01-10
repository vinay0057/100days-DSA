package BinarySearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {5,1,3};
        System.out.println(SIRSA(arr, 3));
    }

    public static int SIRSA(int arr[], int target){
        int len = arr.length;

        int st = 0, end = len-1;
        while(st <= end){
            int mid = st + (end - st)/2;

            if(target == arr[mid]) return mid;

             /* this below condition is specifically for a situation
            where we might have a input like this
            arr = [1,0,1,1,1], with this condition we are able to
            update start and end value by removing the duplicates */
            if (arr[st] == arr[mid] && arr[mid] == arr[end]){
                st++;
                end--;
                continue;
            }

            /*Now the array is rotated at kth indices, so we have 2 conditions
            before we search in the array*/

            /*NOTE: Always first check in the sorted side, determine which side is sorted,
             and search in that side */

            if(arr[st] <= arr[mid]){
                if(target >= arr[st] && target < arr[mid]) end = mid - 1;
                else st = mid + 1;
            }else{
                if(target > arr[mid] && target <= arr[end]) st = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}
