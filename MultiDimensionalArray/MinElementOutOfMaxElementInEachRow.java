package MultiDimensionalArray;

//In this question we have to find the minimum element out of all the
//maximum elements of each row

//We'll do this questions in 2 different approaches, 1st by assuming that
//arr[i][j] is <= 100
//2nd will be,
//arr[i][j] is <= Integer.MAX_VALUE
public class MinElementOutOfMaxElementInEachRow {
    public static void main(String[] args) {
        int arr[][] = {{21,45,29}, {54,32,11}, {83, 66, 19}};
        System.out.println(MEOMEwithFirstCondition(arr));
        System.out.println("----------------");
        System.out.println(MEOME(arr ));
    }

    public static int MEOMEwithFirstCondition(int arr[][]){
        int rowlen = arr.length;
        int collen = arr[0].length;

        int maxElement = Integer.MIN_VALUE;

        for(int i=0; i<rowlen; i++){
            for(int j=0; j<collen; j++){
                if(arr[i][j] > maxElement) maxElement = arr[i][j];
            }
        }

        int freq[] = new int[maxElement+1];

        for(int i=0; i<rowlen; i++){
            int maxVar = 0;
            for(int j=0; j<collen; j++){
                if(arr[i][j] > maxVar) {
                    maxVar = arr[i][j];
                }
            }
            freq[maxVar] += 1;
        }


        for(int i=0; i<freq.length; i++){
            if(freq[i] == 1) return i;
        }

        return 0;
    }

    /*In second condition we can make a arraylist to store all the max elements
    * from each row and then return the smallest element out of it*/

    /*The above solution can be done with one more optimal and easy way*/

    public static int MEOME(int[][] arr) {
        int minOfMax = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int rowMax = Integer.MIN_VALUE;
            for (int j = 0; j < arr[0].length; j++) {
                rowMax = Math.max(rowMax, arr[i][j]);
            }
            minOfMax = Math.min(minOfMax, rowMax);
        }

        return minOfMax;
    }

}
