package MultiDimensionalArray;

import java.util.Arrays;

public class TransposeOfSquareMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6}, {7,8,9}};
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------");
        transposeMatrix(arr);
    }
    public static void transposeMatrix(int arr[][]){
        int row = arr.length;
        int col = arr[0].length;

        for(int i=0; i<row; i++){ //catch what to put j's starting value, is when we draw the matrix
            for(int j=i+1; j<col; j++){ //we get to know that j is starting from (0,1) and that's the clue
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
