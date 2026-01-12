package MultiDimensionalArray;

public class LargestAndSmallestNumberIn2DArray {
    public static void main(String[] args) {
        int arr[][] = {{21,45,92}, {54,32,11}, {83, 66, 19}};
        int smallestNum = smallestNumber(arr);
        int largestNum = largestNumber(arr);

        System.out.println("Smallest Number: "+smallestNum);
        System.out.println("Largest Number: "+largestNum);
    }

    public static int smallestNumber(int arr[][]){
        int rowlen = arr.length;
        int collen = arr[0].length;

        int smallestNum = Integer.MAX_VALUE;
        for(int i=0; i<rowlen; i++){
            for(int j=0; j<collen; j++){
                if(arr[i][j] < smallestNum) smallestNum = arr[i][j];
            }
        }

        return smallestNum;
    }
    public static int largestNumber(int arr[][]){
        int rowlen = arr.length;
        int collen = arr[0].length;

        int largestNum = Integer.MIN_VALUE;
        for(int i=0; i<rowlen; i++){
            for(int j=0; j<collen; j++){
                if(arr[i][j] > largestNum) largestNum = arr[i][j];
            }
        }

        return largestNum;
    }
}
