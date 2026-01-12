package MultiDimensionalArray;

import java.util.Arrays;

public class Rotate2DArrayBy90Degree {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(rotate(arr)));
    }

    public static int[][] rotate(int arr[][]){
        int transposeMatrix[][] = RowsToColoumn.transpose(arr);

        int row = 0;
        for(int i=0; i<transposeMatrix.length; i++){
            int col = transposeMatrix[0].length-1;
            for(int j=0; j<transposeMatrix[0].length; j++){
                if(row < col){
                    int temp = transposeMatrix[i][j];
                    transposeMatrix[i][j] = transposeMatrix[row][col];
                    transposeMatrix[row][col] = temp;
                    col--;
                }
            }
            row++;
        }
        return transposeMatrix;
    }
}
