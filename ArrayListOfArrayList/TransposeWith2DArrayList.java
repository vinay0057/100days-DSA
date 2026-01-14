package ArrayListOfArrayList;

import java.util.ArrayList;

//this program is to find the transpose of a matrix but using array lists
public class TransposeWith2DArrayList {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,8}, {7,4,5,6}, {7,8,9,6}};
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("-----------");
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        a = transpose(arr);

        for(int i=0; i<a.size(); i++){
            for(int j=0; j<a.get(0).size(); j++){
                System.out.print(a.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static ArrayList<ArrayList<Integer>> transpose(int[][] mat) {

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        /*int rowsInMat = mat.length;

        for(int i=0; i<rowsInMat; i++){
            arr.add(new ArrayList<>());
        }

        for(int j=0; j<mat[0].length; j++){
            for(int i=0; i<mat.length; i++){
                arr.get(j).add(mat[i][j]);
            }
        }*/

        for(int j=0; j<mat[0].length; j++){
            arr.add(new ArrayList<>());
            for(int i=0; i<mat.length; i++){
                arr.get(j).add(mat[i][j]);
            }
        }
        return arr;
    }
}
