package BinarySearch;

//implementing binary search
public class BSbasic {
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 9, 12};
        System.out.println(BinarySearchMethod(arr, 13));
    }

    public static int BinarySearchMethod(int arr[], int target){
        int len = arr.length; //storing the length of the given array

        int left = 0, right = len-1;  // representing default index positions of the array
        while(left <= right){ //why <= , bcoz at some point left and right can stand on same index
            int mid = left + (right - left)/2; // if we find mid with left + right / 2, then it might excced
                                                //to the integer range, for some cases

            if(target == arr[mid]) return mid; // return index if number found
            else if(target < arr[mid]) right = mid - 1;
            else left = mid + 1;
        }

        return -1; //if not found return -1;
    }
}
