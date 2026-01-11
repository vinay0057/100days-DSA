package BinarySearch;
//In this question we have to find a single element in a sorted array;
//So we are given a sorted array consisting of only integers where every,
//element appears exactly twice, except for one element which appears exactly once.
public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,4,8};
        System.out.println(SEISA(arr));
    }

    public static int SEISA(int nums[]){
        int len = nums.length;

        if(len == 1)return nums[0];

        //handling edge cases
        if(nums[0] != nums[1]) return nums[0];
        if(nums[len-1] != nums[len-2]) return nums[len-1];

        int left = 0;
        int right = len-1;
        while(left <= right){
            int mid = left + (right-left)/2;

            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];

            if(mid % 2 == 0){
                if(nums[mid] == nums[mid+1]) left = mid + 1; //if irder preserve go right
                else right = mid - 1;// else go left
            }else{
                if(nums[mid] == nums[mid-1]) left = mid + 1; //if order preserve go right
                else right = mid - 1; // else go left
            }
        }

        return 0;
    }
}
