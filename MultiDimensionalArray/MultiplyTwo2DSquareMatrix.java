package MultiDimensionalArray;

import java.util.Arrays;

public class MultiplyTwo2DSquareMatrix {
    public static void main(String[] args) {
        int a[][] = {{1,3},{1,1}};
        int b[][] = {{2,2}, {2,2}};

        int c[][] = multiply(b, a);

        for(int i=0; i<c.length; i++){
            for(int j=0; j<c[0].length; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] multiply(int a[][], int b[][]){
        int n = a.length;

        int c[][] = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                //why this loop instead of a variable (int k = 0), because this loop is doing n operations
                //continuously which are c[0][0] += a[0][0] * b[0][0] and c[0][0] += a[0][1] * b[1][0];
                //if we have used a variable then it
                for(int k=0; k<n; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }


        return c;
    }
}
