package MultiDimensionalArray;

import java.util.Arrays;

public class BsOn2DArray {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8}, {9, 10, 11, 12}, {13,14,15,16}};
        System.out.println(Arrays.toString(searchInMatrix(arr, 1)));
        System.out.println(Arrays.toString(bsOn2DArray(arr, 14)));
    }
    //Time Complexity = O(m + log(n)) m = rows, n = cols
    /*In this method, i am using two bounds, one on (0,0) and another
    (0,3) it means, if array is like
    1,2,3,4  here i am checking is target >= 1 and target <= 4
    5,6,7,8  here i am checking is target >=5 and target <= 8
    9,10,11,12  here i am checking is target >= 9 and target <= 12
    13,14,15,16 here i am checking is target >= 13 and target <= 16

    therefore i have to traverse each row and check the bound if target lies
    i directly apply binary search on that 1D array
    */
    public static int[] searchInMatrix(int arr[][], int t){
        int j=0, k=arr[0].length-1;
        int row = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i][j] <= t && arr[i][k] >= t) {row = i;
            break;}
        }

        if(row == -1) return new int[]{-1,-1};

        int col = Arrays.binarySearch(arr[row], t);

        if(col >= 0) return new int[]{row, col};

        return new int[]{-1,-1};
    }

    //Time Complexity = O(log(m x n)) m = rows, n = cols;
    /*In this method i have treated the 2D matrix as a
    1D matrix virtually, eg [1,2,3,4,5,6,7,8,9] now i
    know hot to apply bs on this 1D array, now when ever
    i get the middle index i convert it into 2D index, how
    for row = mid / n(cols present in 2D Array)
    for col = mid % n(cols present in 2D Array)

    the intuition behind this conversion is that
    if we observe the 2D array

cols 0  1  2  3
rows
0    1, 2, 3, 4

     0  1  2  3  //virtual 1D indexes

1    5, 6, 7, 8

     4  5  6  7  //virtual 1D indexes

    no if we do {1D index(mid)/ cols(which is 4)} or basically this  int row = mid/n;
                                                                     int col = mid%n;
    then see the first row will always have a multiple of n (column) and if we
    have to find the column we do the modulus we get the col, to find the row we do the divide
    it means how many elements we have passed on currently, lets say i came to 6th index, know
    if i need to find row, i have to check how many element i have passed and which i the current
    element i am standing on, therefore 6(current index)/4(total columns) we have passed 1 row


    To apply binary search in 2D array, first analyze the array carefully,
    if array is sorted in such way that every last element of each row is less
    than the 0th index of 2nd or upcoming row then we can apply BS,
    eg - [[1,3,5,7],[10,11,16,20],[23,30,34,60]]
    Not to apply BS
    eg - [1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]*/
    public static int[] bsOn2DArray(int arr[][], int target){
        int m = arr.length;
        int n = arr[0].length;
        int i = 0;
        int j = (m*n) - 1;

        while(i <= j){
            int mid = i + (j-i)/2;

            //converted virtual 1D index to 2D index
            int row = mid/n;
            int col = mid%n;

            if(arr[row][col] == target) return new int[]{row, col};
            else if(target < arr[row][col]) j = mid - 1;
            else i = mid + 1;
        }

        return new int[]{-1,-1};
    }
}
