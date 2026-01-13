package ArrayListOfArrayList;

import java.util.ArrayList;

public class RetrieveAndUpdateElementOf2DArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        arr.add(new ArrayList<>());
        arr.get(0).add(1);
        arr.get(0).add(2);
        arr.get(0).add(3);

        arr.add(new ArrayList<>());
        arr.get(1).add(4);
        arr.get(1).add(5);

        arr.add(new ArrayList<>());
        arr.get(2).add(6);
        arr.get(2).add(7);
        arr.get(2).add(8);
        arr.get(2).add(9);

        /*System.out.println(arr);

        arr.get(2).set(1, 70);

        System.out.println(arr);*/

        printArrayList(arr);


    }

    public static void printArrayList(ArrayList<ArrayList<Integer>> arr){
        int rowsize = arr.size();

        for(int i=0; i<rowsize; i++){
            for(int j=0; j<arr.get(i).size(); j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
