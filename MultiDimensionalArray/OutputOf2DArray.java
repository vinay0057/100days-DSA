package MultiDimensionalArray;

public class OutputOf2DArray {
    public static void main(String[] args) {
        //int arr[][] = new int[3][4];
                     //    0          1          2
        int arr[][] = {{1,2,3,4}, {4,5,3,2}, {4,6,3,2}}; // abc123
                    //  0 1 2 3    0 1 2 3    0 1 2 3

        /*for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        for(int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        change(arr, 1,2);

            for(int i=0; i<arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            //shallow copy
            int a = 10; // 10
        System.out.println(a);
            changeInt(a);//10
        System.out.println(a);
    }

    public static void change(int arr[][], int i, int j){
        arr[i][j] = 10;
    }

    public static void changeInt(int num){
        num = 20;
    }
}
