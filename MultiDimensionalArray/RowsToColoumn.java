package MultiDimensionalArray;
//Transpose of a Rectangular Matrix
import java.lang.reflect.Array;
import java.util.Arrays;

public class RowsToColoumn {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,7},{4,5,6,1}, {7,8,9,4}};
        int rowlen = arr.length;
        int collen = arr[0].length;

        int arr2[][] = new int[collen][rowlen];

        for(int i=0; i<rowlen; i++){
            for(int j=0; j<collen; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        /*why the arr2[i][j] == arr[j][i] works because here i is going till col length
        * and j is going till row length, hence both the cases are going in limits*/
        for(int i=0; i<arr2.length; i++){  // here i is less than col length
            for(int j=0; j<arr2[0].length; j++){ // here j is less than row length
                arr2[i][j] = arr[j][i];
            }
        }

        System.out.println("------------");

        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(arr2));

    }

    public static int[][] transpose(int arr[][]){
        int row = arr.length;
        int col = arr[0].length;
        int matrix[][] = new int[col][row];

        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                matrix[i][j] = arr[j][i];
            }
        }

        return matrix;
    }
}
