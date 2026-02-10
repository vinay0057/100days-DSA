package BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class BitwiseAndOrXor {
    public static void main(String[] args) {
       // System.out.println(51&41); AND
        // System.out.println(51|41); OR

        //System.out.println(1^99^1);

        //System.out.println(5 ^ 7);
        /*int arr[] = {30,5,1,30,1,30,1};
        System.out.println(singleNum(arr));*/

        //Inbuilt method to convert decimal to binary
        /*int num = 45;
        String binary = Integer.toBinaryString(num);
        System.out.println(binary);*/

        //System.out.println(3^1^3^1^3^1^2);

       /* int arr[] = {3,1,3,1,3,1,2};
        System.out.println(singleElement2(arr));*/

        String s = "2";
        int a = Integer.parseInt(s);
        System.out.println(a);
    }

    public static int singleNum(int arr[]){
        int i = 1;
        int ans = 0;
        int num = 0;
        while(i < arr.length){
            ans = arr[i-1] ^ arr[i];
            if(ans == 0 && arr[i] != 0){
                num = arr[i];
                System.out.println("num "+num);
            }
            i++;
        }
        return ans^num;

    }

    public static int singleElement2(int arr[]){
        List<Integer> list = new ArrayList<>();

        int i = 0;
        int xor = 0;
        while(i < arr.length){
            xor ^= arr[i++];
            if(xor == 0)list.add(xor);
        }

        for(int j=0; j<list.size(); j++){
            xor ^= list.get(j);
        }

        return xor;
    }
}
