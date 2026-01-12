package MultiDimensionalArray;
//In this code we are finding the row, as well as the max sum of that row
public class MaxRowSum {
    public static void main(String[] args) {
        int arr[][] = {{121,45,92}, {54,32,11}, {83, 66, 19}};
        System.out.println("MaxRowSum: "+MRS(arr));
    }

    public static int MRS(int arr[][]){
        int rowlen = arr.length;
        int collen = arr[0].length;

        int maxSum = Integer.MIN_VALUE;
        int indexrow = -1;
        int indexcol = -1;

        for(int i=0; i<rowlen; i++){
            int sum = 0;

            for(int j=0; j<collen; j++){
                sum += arr[i][j];
                if(sum > maxSum) {maxSum = sum; indexrow = i;} // indexes are optional
            }
        }

        System.out.println(indexrow+"th row"); //just to check the correct row

        return maxSum;
    }
}
