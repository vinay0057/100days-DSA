package Recursion;

public class BinarySearchWithRecursion {
    public static void main(String[] args) {
        int arr[] = {1,2,5,6,8,9};
        System.out.println(search(arr, 8));
    }
    public static int search(int[] nums, int target) {
        int i = 0, j = nums.length-1;
        return check(nums, target, i, j);
    }

    public static int check(int arr[], int target, int i, int j){
        if(i > j) return -1;
        int mid = i + (j-i)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] < target) return check(arr, target, mid+1, j);
        else return check(arr, target, i, mid-1);
    }

    //return the -1 if target is not present in the array
    //if found return the smallest index where the target lies, or the first occurence
    public static int firstOccurence(int arr[], int target){
        int i = 0;
        int j = arr.length - 1;
        int count = 0;
        return checkFirstOccurence(arr, target, i, j, count);
    }

    public static int checkFirstOccurence(int arr[], int target, int i, int j, int count){

        if(i > j && count > 0) return i;
        else if(i > j && count == 0) return -1;

        int mid = i + (j-i)/2;

        if(arr[mid] == target) {
            count += 1;
            return checkFirstOccurence(arr, target, i, mid-1, count);
        }

        else if(arr[mid] < target) return checkFirstOccurence(arr, target, mid+1, j, count);

        else return checkFirstOccurence(arr, target, i, mid-1, count);
    }
}
