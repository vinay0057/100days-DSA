package ArrayListOfArrayList;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int num = 5;
        pTriangle(num);
        //System.out.println(generate(num));
    }

    public static void pTriangle(int n){
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            arr.add(new ArrayList<>());
        }

        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<=i; j++){
                if(i == j || j == 0) arr.get(i).add(1);
                else arr.get(i).add(arr.get(i-1).get(j) + arr.get(i-1).get(j-1));
            }
        }

        //first approach was to build a left triangle like structure
        /*
         1
         1 1
         1 0 1
         1 0 0 1
         1 0 0 0 1

         where i have added all ones in the start and end
         and in middle i have added all the zeroes
         */
        /*for(int i=0; i<arr.size(); i++){
            for(int j=0; j<=i; j++){
                if(i == j || j == 0) arr.get(i).add(1);
                else arr.get(i).add(0);
            }
        }*/

        /*then after that i am setting or replacing all the zeroes with
         the sum of two elements of the previous row i used the concept
         of arrays here, like arr[i][j] = arr[i-1][j] + arr[i-1][j-1]*/

        /*for(int i=2; i<arr.size(); i++){
            for(int j=1; j<arr.get(i).size()-1; j++){
                arr.get(i).set(j, (arr.get(i-1).get(j) + arr.get(i-1).get(j-1)));
            }
        }*/

        //printing the pascals triangle
        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<=i; j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    //better optimal approach for pascals triangle
    public static List<List<Integer>> generate(int n){
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<>());   // create row i

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    ans.get(i).add(1);
                } else {
                    int val = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                    ans.get(i).add(val);
                }
            }
        }
        return ans;
    }
}
