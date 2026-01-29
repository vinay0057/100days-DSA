package CyclicSort;

public class FindDuplicateNumber {
    public static void main(String[] args) {

    }

    public int findDuplicate(int[] arr) {
        int n = arr.length;
        boolean flag = false;

        int i = 0;
        while (i < n) {
            if (i == (arr[i] - 1))
                i++;
            else {
                int idx = arr[i] - 1;
                flag = check(idx, i, arr);
                if (flag)
                    return idx + 1;
                swap(idx, i, arr);
            }
        }

        return 0;
    }

    public static void swap(int a, int b, int arr[]) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static boolean check(int a, int b, int arr[]) {
        if (arr[a] == arr[b])
            return true;
        return false;
    }
}
