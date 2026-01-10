package BinarySearch;

public class ImplementUpperBound {
    public static void main(String[] args) {
        int arr[] = {1,2,4,7,8};
        System.out.println(UB(arr, 3));
    }
    public static int UB(int arr[], int target){
        int len = arr.length;

        if(target < arr[0] || target == arr[0]) return -1; // A check that target should not be less than
        //the first element

        int st = 0, end = len-1; //left = st (start), right = end

        while(st <= end){
            int mid = st + (end - st)/2;

            if(target == arr[mid]) return mid;
            else if(target > arr[mid]) st = mid + 1;
            else end = mid - 1;
        }

        return end;
        /*
        If we have to find a upper bound, where we have to find the first number which is smaller than the
        target or (the first number that is less than the target)
        Example 1 (for upper bound) :
        arr = [1,2,4,7,8] target = 3
        output = 2, first number smaller than the target*/
    }
}
