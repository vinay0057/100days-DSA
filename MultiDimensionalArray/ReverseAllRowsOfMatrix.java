package MultiDimensionalArray;

public class ReverseAllRowsOfMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4}, {5,1,2,3}, {6,7,1,9}};

        for(int i=0; i<arr.length; i++){
            for(int j=arr[0].length-1; j>=0; j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
