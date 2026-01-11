package BinarySearch;

public class FindHowManyTimeArrayIsRotated {
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        System.out.println(FHMTAIR(arr));
    }

    public static int FHMTAIR(int arr[]){
        int len = arr.length;

        /*To find how many time the array is rotated we can again find the
        min element in the array, and can then return len - indexOfMinElement*/

        int left = 0;
        int right = len - 1;
        while(left <= right){
            int mid = left + (right - left)/2;

            if(mid != 0 && arr[mid] < arr[mid-1]) return len - mid; // after getting min element we can simply
            //return its index, and subtract it directly from the array length and we will get our answer;

            if(arr[mid] >= arr[right]) left = mid + 1; // go right
            else right = mid - 1; //go left
        }

        return -1;
    }
}
