package BinarySearch;

public class FindMinimumInRotatedArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,9,10,2,3};
        System.out.println(FMIRA(arr));
    }
    public static int FMIRA(int arr[]){
        int len = arr.length;

        /* If array is rotated to len times, then it actually came in
        its normal form.
         */
        if(arr[0] < arr[len-1]) return arr[0];
        if(len == 1) return arr[0]; //edge case
        if(len == 2 && arr[0] > arr[len-1]) return arr[len-1]; //edge case for len = 2, eg [2,1]

        int left = 0, right = len - 1;
        while(left <= right){
            int mid = left + (right - left)/2;

            /*now we have to find a minimum element in the rotated sorted array
            so the first intuition is to check the mid with start, and identify
            which side is sorted, and then we go to opposite side, and the min element
            will always lie after the element that is greater to it, as array is
            left rotated

            but this intuition does not satisfy a case [4,5,6,1,2,3], therefore i
            changed my approach, by comparing mid and end, here also i have to check,
            which side is sorted or not and the side which is not sorted definitely
            my drop or min element is in that side*/

            //how to identify min element
            if(mid != 0 && arr[mid] < arr[mid-1]) return arr[mid];  // and it is true for every rotated sorted array

            if(arr[mid] >= arr[right]) left = mid + 1; //we go right, towards unsorted side;
            else right = mid - 1;
        }
        return  -1; // as we will get our output inside the loop only
    }
}
