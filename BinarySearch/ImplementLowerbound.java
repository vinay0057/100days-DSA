package BinarySearch;

/*In this question we have to find a given target, if found return target else return first and smallest
number which is greater than the target.
 */
public class ImplementLowerbound {
    public static void main(String[] args) {
        int arr[] = {19,21,37,43,72,89} ;
        System.out.println(LB(arr, 65));
    }

    public static int LB(int arr[], int target){
        int len = arr.length;

        if(target > arr[len-1]) return -1; // A check that target should not be greater than the last
        //element

        int st = 0, end = len-1; //left = st (start), right = end

        while(st <= end){
            int mid = st + (end - st)/2;

            if(target == arr[mid]) return mid;
            else if(target > arr[mid]) st = mid + 1;
            else end = mid - 1;
        }

        return st; /*we have return start because this st goes till the first and smallest
        number greater than the target or (the first number that is greater than target),

        Example 1 (for lower bound) :
        arr = [1,2,3,4,7,8] target = 5
        output = 7, first number greater than the target */
    }
}
